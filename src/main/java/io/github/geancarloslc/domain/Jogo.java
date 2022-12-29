package io.github.geancarloslc.domain;

public class Jogo{

    private Long pontuacao = 0L;
    private Long erros = 0L;

    public void acertouOuErrou(Boolean acertou){
        if(acertou){
            this.pontuacao += 1;
        } else {
            this.erros += 1;
        }
    }

    public Long getPontuacao() {
        return pontuacao;
    }

    public Long getErros() {
        return erros;
    }
}
