package com.dp.strategy.model;

import com.dp.strategy.enumeration.TaxType;
import org.springframework.stereotype.Component;

@Component
public class IOF implements Tax {
  private final double IOFTax = 0.135;

  @Override
  public TaxType taxType() {
    System.out.println("Calculando IOF com taxa de " + IOFTax);
    return TaxType.IOF;
  }

  @Override
  public double calculateTax(double value) {
    return value * IOFTax;
  }
}
