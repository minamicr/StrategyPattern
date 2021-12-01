package com.dp.strategy.service;

import static org.assertj.core.api.BDDAssertions.then;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TaxCalculatorTest {
  TaxCalculator taxCalculator;

  @BeforeEach
  public void setUp(){
    taxCalculator = new TaxCalculator();
  }

  @Test
  void givenICMSWhenCalcularImpostoThenReturnValorICMS(){
    double valorIcms = taxCalculator.calculateTax("ICMS", 100);
    then(valorIcms).isEqualTo(15.0);
  }

  @Test
  void givenIOFWhenCalcularImpostoThenReturnValorIOF(){
    double valorIcms = taxCalculator.calculateTax("IOF", 100);
    then(valorIcms).isEqualTo(13.5);
  }

}