package br.com.cosme.leitura_escrita.LeituraEscrita.repository;

import br.com.cosme.leitura_escrita.LeituraEscrita.model.Contato;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ContatoRepository {

    // crio uma'variavel' que vai receber o arquivo csv e para gravar é so chamar essas variavel
    private Path arquivo = Paths.get("/Users/25203620/arquivos/dados.csv");
    public Contato contato;

   public void grava() {
        // aqui chama a variavel e grava o try e catch é so tratamento de erro
       try {
           Files.writeString(arquivo,contato.separarDadosContato(), StandardOpenOption.APPEND);
       } catch (IOException erro) {
           erro.printStackTrace();
           throw new RuntimeException(erro);
       }


   }

   public void exibirContato() {
       //formas de pegar o dados e imprimir no terminal


       try {
           List<String> linhas =Files.readAllLines(arquivo);
           for(String linha : linhas) {
               String[] linhaContato = linha.split(";");
               System.out.println("/////////////////////////////////////");
               System.out.println("NOME: "+linhaContato[1]);
               System.out.println("TELEFONE: "+linhaContato[2]);
               System.out.println("EMAIL: "+linhaContato[3]);
               System.out.println("/////////////////////////////////////");

               System.out.println(linha);
           }
           /*
           int cont = 0;
           while (cont < linhas.size()){

               System.out.println(linhas.get(cont));
               cont++;


           }*/


       } catch (IOException e) {
           throw new RuntimeException(e);
       }


   }







}
