package com.tanuj.valuation_tool.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ticker;
    private String name;
    private double revenue;
    private double ebitda;
    private double netIncome;
    private double sharesOutstanding;

    public Company() {}

    public Company(String ticker, String name, double revenue, double ebitda, double netIncome, double sharesOutstanding) {
        this.ticker = ticker;
        this.name = name;
        this.revenue = revenue;
        this.ebitda = ebitda;
        this.netIncome = netIncome;
        this.sharesOutstanding = sharesOutstanding;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTicker() { return ticker; }
    public void setTicker(String ticker) { this.ticker = ticker; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getRevenue() { return revenue; }
    public void setRevenue(double revenue) { this.revenue = revenue; }
    public double getEbitda() { return ebitda; }
    public void setEbitda(double ebitda) { this.ebitda = ebitda; }
    public double getNetIncome() { return netIncome; }
    public void setNetIncome(double netIncome) { this.netIncome = netIncome; }
    public double getSharesOutstanding() { return sharesOutstanding; }
    public void setSharesOutstanding(double sharesOutstanding) { this.sharesOutstanding = sharesOutstanding; }
}

