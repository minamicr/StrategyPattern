package com.dp.strategy.service;

import static org.assertj.core.api.BDDAssertions.then;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraImpostoTest {
  CalculadoraImposto calculadoraImposto;

  @BeforeEach
  public void setUp(){
    calculadoraImposto = new CalculadoraImposto();
  }

  @Test
  void givenICMSWhenCalcularImpostoThenReturnValorICMS(){
    double valorIcms = calculadoraImposto.calcularImposto("ICMS", 100);
    then(valorIcms).isEqualTo(15.0);
  }

  @Test
  void givenIOFWhenCalcularImpostoThenReturnValorIOF(){
    double valorIcms = calculadoraImposto.calcularImposto("IOF", 100);
    then(valorIcms).isEqualTo(13.5);
  }

}