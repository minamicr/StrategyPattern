package com.dp.strategy.service;

import static org.assertj.core.api.BDDAssertions.then;

import com.dp.strategy.enumeration.TipoImposto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculadoraTest {

  @Autowired
  CalculadoraStrategy calculadora;

  @Test
  void dadoTipoImpostoICMSQuandoCalcularEntaoRetorneValorICMS(){
    double valorICMS = calculadora.calcular(TipoImposto.ICMS, 100);
    then(valorICMS).isEqualTo(15.0);
  }

  @Test
  void dadoTipoImpostoIOFQuandoCalcularEntaoReturneValorIOF(){
    double valorIOF = calculadora.calcular(TipoImposto.IOF, 100);
    then(valorIOF).isEqualTo(13.5);
  }

}