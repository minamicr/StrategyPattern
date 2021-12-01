package com.dp.strategy.service;

import com.dp.strategy.enumeration.TaxType;
import org.springframework.stereotype.Service;

@Service
public class StrategyCalculator {
  private final TaxRegistry taxRegistry;

  public StrategyCalculator(TaxRegistry taxRegistry){
    this.taxRegistry = taxRegistry;
  }


  public double calculate(TaxType taxType, double value){
    return taxRegistry.getTaxStrategy(taxType)
        .orElseThrow(() -> new IllegalArgumentException("Tipo de imposto desconhecido"))
        .calculateTax(value);
  }

}
