package io.github.geancarloslc.domain.bancopalavras;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Arquivo{

    public String conteudoArquivo() {
        String conteudo = "";
        try {
            FileReader arquivo = new FileReader("/Users/topga/Documents/Curso/Semana06/palavras.txt");
            BufferedReader reader = new BufferedReader(arquivo);

            String linha = "";
            try {
                linha = reader.readLine();
                while (linha != null){
                    conteudo += linha;
                    linha = reader.readLine();
                }
                arquivo.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        return conteudo;
    }
}
