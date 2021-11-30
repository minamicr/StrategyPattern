package com.dp.strategy.model;

import com.dp.strategy.enumeration.TipoImposto;
import org.springframework.stereotype.Component;

@Component
public class ICMS implements Imposto {
  private final double taxaICMS = 0.15;

  @Override
  public TipoImposto tipoImposto() {
    return TipoImposto.ICMS;
  }

  @Override
  public double calcularImposto(double valor) {
    System.out.println("Calculando ICMS com taxa de " + taxaICMS);
    return valor * taxaICMS;
  }
}
