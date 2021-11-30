package com.dp.strategy.service;

import com.dp.strategy.model.Imposto;
import com.dp.strategy.enumeration.TipoImposto;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ImpostoRegistry {
  private final List<Imposto> impostos;

  public Optional<Imposto> getImposto(TipoImposto tipoImposto) {
    return impostos.stream()
        .filter(imposto -> imposto.tipoImposto().equals(tipoImposto))
        .findAny();
  }

}
