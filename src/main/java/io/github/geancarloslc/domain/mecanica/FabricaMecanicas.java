package io.github.geancarloslc.domain.mecanica;


public class FabricaMecanicas {
    public static MecanicaJogo dificuldade(String mecanica) {
        if (mecanica.equalsIgnoreCase("F")) {
            return new MecanicaFacil();
        } else {
            return new MecanicaDificil();
        }
    }
}
