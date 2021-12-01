package com.dp.strategy.service;

import com.dp.strategy.enumeration.TaxType;
import com.dp.strategy.model.Tax;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Component;

@Component
public class TaxRegistry {
  private final List<Tax> taxes;

  public TaxRegistry(List<Tax> taxes){
    this.taxes = taxes;
  }

  public Optional<Tax> getTaxStrategy(TaxType taxType) {
    return taxes.stream()
        .filter(tax -> tax.taxType().equals(taxType))
        .findAny();
  }

}
