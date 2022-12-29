package io.github.geancarloslc.domain.embaralhador;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EmbaralhadorAleatorio implements Embaralhador {

    @Override
    public String embaralhar(String palavra) {

        List<Character> letras = palavra.chars().boxed().map(c -> (char) c.intValue()).collect(Collectors.toList());
        Collections.shuffle(letras);
        StringBuilder palavraFormatada = new StringBuilder(palavra.length());
        letras.forEach(palavraFormatada::append);
        return palavraFormatada.toString();
    }


}
