package br.com.cosme.leitura_escrita.LeituraEscrita.model;

public class Contato {
    public String id;
    public String nome;
    public String telefone;
    public String email;


    public String separarDadosContato(){
        String contatoSeprado = id+ ";" + nome + ";" + telefone+ ";" + email+ "\n";

        return contatoSeprado;

    };


}
