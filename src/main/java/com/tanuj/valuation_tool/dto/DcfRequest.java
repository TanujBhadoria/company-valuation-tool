package com.tanuj.valuation_tool.dto;

public class DcfRequest {
    private double growthRate;
    private double wacc;
    private double terminalGrowthRate;
    private int projectionYears;
    private double netDebt;

    public DcfRequest() {}

    public double getGrowthRate() { return growthRate; }
    public void setGrowthRate(double growthRate) { this.growthRate = growthRate; }
    public double getWacc() { return wacc; }
    public void setWacc(double wacc) { this.wacc = wacc; }
    public double getTerminalGrowthRate() { return terminalGrowthRate; }
    public void setTerminalGrowthRate(double terminalGrowthRate) { this.terminalGrowthRate = terminalGrowthRate; }
    public int getProjectionYears() { return projectionYears; }
    public void setProjectionYears(int projectionYears) { this.projectionYears = projectionYears; }
    public double getNetDebt() { return netDebt; }
    public void setNetDebt(double netDebt) { this.netDebt = netDebt; }
}
