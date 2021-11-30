package com.dp.strategy.model;

import com.dp.strategy.enumeration.TipoImposto;

public interface Imposto {
  TipoImposto tipoImposto();
  double calcularImposto(double valor);

}
