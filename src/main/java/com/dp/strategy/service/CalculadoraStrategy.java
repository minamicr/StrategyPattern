package com.dp.strategy.service;

import com.dp.strategy.enumeration.TipoImposto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CalculadoraStrategy {

  private final ImpostoRegistry registry;

  public double calcular(TipoImposto tipoImposto, double valor){
    return registry.getImposto(tipoImposto)
        .orElseThrow(() -> new IllegalArgumentException("Tipo desconhecido"))
        .calcularImposto(valor);
  }

}
