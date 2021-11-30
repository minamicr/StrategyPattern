package com.dp.strategy.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraImposto {

  public double calcularImposto(String imposto, double valor){
    if(imposto.equals("ICMS")){
      return valor * 0.15;
    } else if(imposto.equals("IOF")){
      return valor * 0.135;
    } else {
      return 0.0;
    }
  }

}
