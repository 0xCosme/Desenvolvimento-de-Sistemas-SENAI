package br.senai.sp.jandira.Jokenpo.model;

import java.util.Random;
import java.util.Scanner;


public class JogoJokenpo {
    int usuario;
    int pc;

    String resultado;
    String apresentacaoUsuario;
    String apresentacaoPc;

    public void menu(){

        System.out.println("|----------------------------|");
        System.out.println("|---------**JOKENPO**--------|");
        System.out.println("|----------------------------|");
        System.out.println("|ESCOLHA UMA OPÇÂO:..........|");
        System.out.println("|(0)PEDRA....................|");
        System.out.println("|(1)PAPEL....................|");
        System.out.println("|(2)TESOURA..................|");
        System.out.println("|----------------------------|");
        coletaDados();

    }


    public void coletaDados(){
        Scanner leitorInt = new Scanner(System.in);
        Random r = new Random();

        usuario  =  leitorInt.nextInt();
        //numeros aleatotios de zero a 2
        pc = r.nextInt(3);

        exibirResultado();
        System.out.println("|----**JOGAR NOVAMENTE**----|");
        System.out.println("|(0)SIM.....................|");
        System.out.println("|(1)NAO.....................|");
        int jugar =0;
        jugar = leitorInt.nextInt();
        if (jugar == 0){
            menu();
        }

    }

    public void calculaREsultado(){
        int pedra = 0;
        int papel = 1;
        int tesoura = 2;

        if (usuario ==0  && pc ==1){
            apresentacaoUsuario = "PEDRA";
            apresentacaoPc = "PAPEL";
            resultado = "DERROTA";
        }
        if (usuario ==0  && pc ==2){
            apresentacaoUsuario = "PEDRA";
            apresentacaoPc = "TESOURA";
            resultado = "VITORIA";
        }
        if (usuario ==1  && pc ==0){
            apresentacaoUsuario = "PAPEL";
            apresentacaoPc = "PEDRA";
            resultado = "VITORIA";
        }
        if (usuario ==1  && pc ==2){
            apresentacaoUsuario = "PAPEL";
            apresentacaoPc = "TESOURA";
            resultado = "DERROTA";
        }
        if (usuario ==2  && pc ==0){
            apresentacaoUsuario = "TESOURA";
            apresentacaoPc = "PEDRA";
            resultado = "DERROTA";
        }
        if (usuario ==2  && pc ==1){
            apresentacaoUsuario = "TESOURA";
            apresentacaoPc = "PAPEL";
            resultado = "VITORIA";
        }
        if(usuario == pc ){
            apresentacaoUsuario = "";
            apresentacaoPc = "";
            resultado = "IMPATE";
        }
    }
    public void exibirResultado(){
        calculaREsultado();
        System.out.println("|----------------------------|");
        System.out.println("|---------**JOKENPO**--------|");
        System.out.println("|----------------------------|");
        System.out.println("|COMPUTADOR ESCOLHEU:......." + apresentacaoPc);
        System.out.println("|USUARIO ESCOLHEU:.........." + apresentacaoUsuario);
        System.out.println("|RESULTADO:..........." + resultado);
        System.out.println("|-----------------------------|");

    }

}
