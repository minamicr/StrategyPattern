package com.dp.strategy.service;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.BDDAssertions.then;

import com.dp.strategy.enumeration.TaxType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StrategyCalculatorTest {

  @Autowired
  StrategyCalculator strategyCalculator;

  @Test
  void givenTipoImpostoICMSWhenCalcularThenRetorneValorICMS(){
    double valorICMS = strategyCalculator.calculate(TaxType.ICMS, 100);
    then(valorICMS).isEqualTo(15.0);
  }

  @Test
  void givenTipoImpostoIOFWhenCalcularThenReturneValorIOF(){
    double valorIOF = strategyCalculator.calculate(TaxType.IOF, 100);
    then(valorIOF).isEqualTo(13.5);
  }

  @Test
  void givenTipoImpostoIPIWhenCalcularThenReturneValorIPI(){
    double valorIPI = strategyCalculator.calculate(TaxType.IPI, 100);
    then(valorIPI).isEqualTo(5);
  }


  @Test
  void givenTipoImpostoInvalidoWhenCalcularThenLancarExcecao(){
    assertThatCode(() -> strategyCalculator.calculate(
        null, 0)).hasMessageContaining("Tipo de imposto desconhecido");
  }

  @Test
  void givenTipoImpostoIRNaoImplementadoWhenCalcularThenLancarExcecao(){
    assertThatCode(() -> strategyCalculator.calculate(
        TaxType.IR, 100)).hasMessageContaining("Tipo de imposto desconhecido");
  }

}