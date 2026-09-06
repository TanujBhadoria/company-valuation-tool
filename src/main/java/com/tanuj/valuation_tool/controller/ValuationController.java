package com.tanuj.valuation_tool.controller;

import com.tanuj.valuation_tool.dto.DcfRequest;
import com.tanuj.valuation_tool.dto.DcfResponse;
import com.tanuj.valuation_tool.service.ValuationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/valuation")
@CrossOrigin(origins = "*")
public class ValuationController {

    @Autowired
    private ValuationService valuationService;

    @PostMapping("/dcf/{ticker}")
    public DcfResponse getDcf(@PathVariable String ticker, @RequestBody DcfRequest request) {
        return valuationService.calculateDcf(ticker, request);
    }
}