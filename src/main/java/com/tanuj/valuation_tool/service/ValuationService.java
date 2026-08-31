package com.tanuj.valuation_tool.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tanuj.valuation_tool.controller.dto.DcfRequest;
import com.tanuj.valuation_tool.controller.dto.DcfResponse;
import com.tanuj.valuation_tool.model.Company;
import com.tanuj.valuation_tool.repository.CompanyRepository;

@Service
public class ValuationService {

    @Autowired
    private CompanyRepository companyRepository;

    public DcfResponse calculateDcf(String ticker, DcfRequest request){
         Company company = companyRepository.findByTicker(ticker)
                .orElseThrow(() -> new RuntimeException("Company not found: " + ticker));

        // Base FCF assumption: using EBITDA as starting point (simplified)
        double baseFCF = company.getEbitda();

        List<Double> projectedFCFs = new ArrayList<>();
        List<Double> discountedFCFs = new ArrayList<>();

        double enterpriseValue = 0;
        double lastFCF = baseFCF;

          for (int year = 1; year <= request.getProjectionYears(); year++) {
            double fcf = lastFCF * (1 + request.getGrowthRate());
            double discountedFCF = fcf / Math.pow(1 + request.getWacc(), year);

            projectedFCFs.add(fcf);
            discountedFCFs.add(discountedFCF);

            enterpriseValue += discountedFCF;
            lastFCF = fcf;
        }

                // Terminal Value (using perpetuity growth method)
        double terminalValue = (lastFCF * (1 + request.getTerminalGrowthRate()))
                / (request.getWacc() - request.getTerminalGrowthRate());

        double discountedTerminalValue = terminalValue / Math.pow(1 + request.getWacc(), request.getProjectionYears());

        enterpriseValue += discountedTerminalValue;

        double equityValue = enterpriseValue - request.getNetDebt();
        double pricePerShare = equityValue / company.getSharesOutstanding();

        return new DcfResponse(
                ticker,
                projectedFCFs,
                discountedFCFs,
                terminalValue,
                discountedTerminalValue,
                enterpriseValue,
                equityValue,
                pricePerShare
        );
    }
}
