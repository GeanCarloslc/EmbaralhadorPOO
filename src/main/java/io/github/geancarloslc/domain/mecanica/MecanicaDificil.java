package io.github.geancarloslc.domain.mecanica;

import io.github.geancarloslc.domain.Jogo;

public class MecanicaDificil implements MecanicaJogo {

    @Override
    public Boolean jogoTerminou(Jogo jogo) {
        if(jogo.getPontuacao() == 20L || jogo.getErros() == 3L){
            return true;
        }
        return false;
    }

    @Override
    public Boolean validaRodada(String palavraDigitada, String palavraOriginal) {
        return palavraDigitada.equalsIgnoreCase(palavraOriginal);
    }

    @Override
    public String score(Jogo jogo) {
        String resultado = "";
        if (jogo.getPontuacao() == 20L) {
            resultado = "=== Voce ganhou! ====";
        } else {
            resultado = "==== Voce perdeu! ====";
        }

        return resultado + "\nPlacar final: \nAcertos(" + jogo.getPontuacao() + ") \nErros(" + jogo.getErros() + ")";
    }
}
