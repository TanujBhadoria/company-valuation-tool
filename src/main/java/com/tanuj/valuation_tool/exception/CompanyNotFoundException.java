package com.tanuj.valuation_tool.exception;

public class CompanyNotFoundException extends RuntimeException {
    public CompanyNotFoundException(String ticker){
        super("Company Not found with this ticker: "+ticker);
    }
}
