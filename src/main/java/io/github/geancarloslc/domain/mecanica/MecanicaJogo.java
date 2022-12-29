package io.github.geancarloslc.domain.mecanica;

import io.github.geancarloslc.domain.Jogo;

public interface MecanicaJogo{

    Boolean jogoTerminou(Jogo jogo);

    Boolean validaRodada(String palavraDigitada, String palavraOriginal);

    String score(Jogo jogo);

}
