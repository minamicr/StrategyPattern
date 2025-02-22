package com.dp.strategy.model;

import com.dp.strategy.enumeration.TaxType;
import org.springframework.stereotype.Component;

@Component
public class ICMS implements Tax {
  private final double ICMSTax = 0.15;

  @Override
  public TaxType taxType() {
    return TaxType.ICMS;
  }

  @Override
  public double calculateTax(double value) {
    System.out.println("Calculando ICMS com taxa de " + ICMSTax);
    return value * ICMSTax;
  }
}
