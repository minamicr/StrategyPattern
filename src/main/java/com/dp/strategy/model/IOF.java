package com.dp.strategy.model;

import com.dp.strategy.enumeration.TipoImposto;
import org.springframework.stereotype.Component;

@Component
public class IOF implements Imposto {
  private final double taxaIOF = 0.135;

  @Override
  public TipoImposto tipoImposto() {
    System.out.println("Calculando IOF com taxa de " + taxaIOF);
    return TipoImposto.IOF;
  }

  @Override
  public double calcularImposto(double valor) {
    return valor * taxaIOF;
  }
}
