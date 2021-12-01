package com.dp.strategy.service;

import org.springframework.stereotype.Service;

@Service
public class TaxCalculator {

  public double calculateTax(String tax, double value){
    if(tax.equals("ICMS")){
      return value * 0.15;
    } else if(tax.equals("IOF")){
      return value * 0.135;
    } else {
      return 0.0;
    }
  }

}
