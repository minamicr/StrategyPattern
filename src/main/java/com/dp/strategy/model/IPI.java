package com.dp.strategy.model;

import com.dp.strategy.enumeration.TaxType;
import org.springframework.stereotype.Component;

@Component
public class IPI implements Tax {
  private final double IPITax = 0.05;

  @Override
  public TaxType taxType() {
    return TaxType.IPI;
  }

  @Override
  public double calculateTax(double value) {
    System.out.println("Calculando IPI com taxa de " + IPITax);
    return value * IPITax;
  }
}
