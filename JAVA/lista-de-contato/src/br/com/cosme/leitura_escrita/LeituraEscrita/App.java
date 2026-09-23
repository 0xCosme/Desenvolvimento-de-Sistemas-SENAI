package br.com.cosme.leitura_escrita.LeituraEscrita;

import br.com.cosme.leitura_escrita.LeituraEscrita.model.Contato;
import br.com.cosme.leitura_escrita.LeituraEscrita.repository.ContatoRepository;

import java.io.Console;
import java.util.Scanner;
import java.util.UUID;

public class App {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Contato contato = new Contato();
/*
        System.out.println("Digite seu nome: ");
        contato.nome     = leitor.nextLine();
        System.out.println("Digite seu email: ");
        contato.email    = leitor.nextLine();
        System.out.println("Digite seu telefone: ");
        contato.telefone = leitor.nextLine();
        contato.id       = UUID.randomUUID().toString();
*/
        ContatoRepository contatoRepository = new ContatoRepository();
        contatoRepository.contato = contato;
        contatoRepository.exibirContato();

    }

}