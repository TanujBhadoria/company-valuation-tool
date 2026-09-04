package com.tanuj.valuation_tool.exception;

public class DuplicateTickerException  extends RuntimeException{
    public DuplicateTickerException(String ticker) {
        super("Company with ticker '" + ticker + "' already exists");
    }
}
