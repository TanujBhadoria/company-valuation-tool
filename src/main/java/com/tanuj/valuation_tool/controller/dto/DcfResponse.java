package com.tanuj.valuation_tool.controller.dto;

import java.util.List;

public class DcfResponse {
    private String ticker;
    private List<Double> projectedFCFs;
    private List<Double> discountedFCFs;
    private double terminalValue;
    private double discountedTerminalValue;
    private double enterpriseValue;
    private double equityValue;
    private double pricePerShare;

     public DcfResponse() {}

    public DcfResponse(String ticker, List<Double> projectedFCFs, List<Double> discountedFCFs,
                        double terminalValue, double discountedTerminalValue,
                        double enterpriseValue, double equityValue, double pricePerShare) {
        this.ticker = ticker;
        this.projectedFCFs = projectedFCFs;
        this.discountedFCFs = discountedFCFs;
        this.terminalValue = terminalValue;
        this.discountedTerminalValue = discountedTerminalValue;
        this.enterpriseValue = enterpriseValue;
        this.equityValue = equityValue;
        this.pricePerShare = pricePerShare;
    }

    public String getTicker() { return ticker; }
    public void setTicker(String ticker) { this.ticker = ticker; }
    public List<Double> getProjectedFCFs() { return projectedFCFs; }
    public void setProjectedFCFs(List<Double> projectedFCFs) { this.projectedFCFs = projectedFCFs; }
    public List<Double> getDiscountedFCFs() { return discountedFCFs; }
    public void setDiscountedFCFs(List<Double> discountedFCFs) { this.discountedFCFs = discountedFCFs; }
    public double getTerminalValue() { return terminalValue; }
    public void setTerminalValue(double terminalValue) { this.terminalValue = terminalValue; }
    public double getDiscountedTerminalValue() { return discountedTerminalValue; }
    public void setDiscountedTerminalValue(double discountedTerminalValue) { this.discountedTerminalValue = discountedTerminalValue; }
    public double getEnterpriseValue() { return enterpriseValue; }
    public void setEnterpriseValue(double enterpriseValue) { this.enterpriseValue = enterpriseValue; }
    public double getEquityValue() { return equityValue; }
    public void setEquityValue(double equityValue) { this.equityValue = equityValue; }
    public double getPricePerShare() { return pricePerShare; }
    public void setPricePerShare(double pricePerShare) { this.pricePerShare = pricePerShare; }

}
