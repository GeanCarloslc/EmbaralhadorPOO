package io.github.geancarloslc;

import io.github.geancarloslc.domain.Jogo;
import io.github.geancarloslc.domain.bancopalavras.BancoPalavra;
import io.github.geancarloslc.domain.embaralhador.Embaralhador;
import io.github.geancarloslc.domain.embaralhador.FabricaEmbaralhadores;
import io.github.geancarloslc.domain.mecanica.FabricaMecanicas;
import io.github.geancarloslc.domain.mecanica.MecanicaJogo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        Embaralhador embaralhador = FabricaEmbaralhadores.modoJogo();
        BancoPalavra bancoPalavra = new BancoPalavra();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o modo de jogo: \n(F) Facil \n(D) Dificil");
        String dificuldade = scanner.next();
        MecanicaJogo mecanicaJogo = FabricaMecanicas.dificuldade(dificuldade);

        while (!mecanicaJogo.jogoTerminou(jogo)){
            String palavraOriginal = bancoPalavra.sortearPalavra();
            String palavraEmbaralhada = embaralhador.embaralhar(palavraOriginal);
            System.out.println("Digite a palavra correta: ");
            System.out.println(palavraEmbaralhada);
            String palavraDigitada = scanner.next();

            jogo.acertouOuErrou(mecanicaJogo.validaRodada(palavraDigitada, palavraOriginal));
        }
        System.out.println(mecanicaJogo.score(jogo));

    }
}
