package com.tanuj.valuation_tool.controller;

import com.tanuj.valuation_tool.model.Company;
import com.tanuj.valuation_tool.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/company")
@CrossOrigin(origins = "*")
public class CompanyController {

    @Autowired
    private CompanyRepository companyRepository;

    @PostMapping
    public Company createCompany(@RequestBody Company company) {
        return companyRepository.save(company);
    }

    @GetMapping
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @GetMapping("/{ticker}")
    public Company getCompany(@PathVariable String ticker) {
        return companyRepository.findByTicker(ticker)
                .orElseThrow(() -> new RuntimeException("Company not found: " + ticker));
    }
}