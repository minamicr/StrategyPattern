package com.dp.strategy.model;

import com.dp.strategy.enumeration.TaxType;

public interface Tax {
  TaxType taxType();
  double calculateTax(double value);

}
