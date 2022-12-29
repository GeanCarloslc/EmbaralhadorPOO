package io.github.geancarloslc.domain.embaralhador;

public class EmbaralhadorReverse implements Embaralhador {

    @Override
    public String embaralhar(String palavra) {
        return new StringBuilder(palavra).reverse().toString().toUpperCase();
    }

}
