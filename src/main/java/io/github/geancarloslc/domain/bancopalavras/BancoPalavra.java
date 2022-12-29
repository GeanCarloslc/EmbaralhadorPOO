package io.github.geancarloslc.domain.bancopalavras;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class BancoPalavra {

    private List<String> palavraLista = new ArrayList<>();

    public BancoPalavra() {
        lerArquivo();
    }

    public void lerArquivo() {
        Arquivo arquivo = new Arquivo();
        String couteudoArquivo = arquivo.conteudoArquivo();
        String[] palavras = couteudoArquivo.split(";");
        palavraLista.addAll(Arrays.asList(palavras));
    }

    public String sortearPalavra(){
        Random random = new Random();
        int indiceSorteado = random.nextInt(this.palavraLista.size());
        return palavraLista.get(indiceSorteado).toUpperCase();
    }

}
