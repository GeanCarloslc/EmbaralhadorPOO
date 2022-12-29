package io.github.geancarloslc.domain.embaralhador;

import java.util.Random;

public class FabricaEmbaralhadores {

    public static Embaralhador modoJogo() {
        Random random = new Random();
        Integer jogoEscolhido = random.nextInt(2);
        if (jogoEscolhido.equals(0)) {
            return new EmbaralhadorReverse();
        } else {
            return new EmbaralhadorAleatorio();
        }
    }
}
