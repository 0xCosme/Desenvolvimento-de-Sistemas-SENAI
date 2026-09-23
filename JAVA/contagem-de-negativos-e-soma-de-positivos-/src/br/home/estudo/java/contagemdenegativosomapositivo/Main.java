package br.home.estudo.java.contagemvetor;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    /*
    4. Faça um programa que carregue um vetor de 15 elementos inteiros diferentes
    digitados pelo usuário. Apresente o vetor ordenado e depois verifique a
    existência de elemento também digitado pelo usuário, mostrando a posição
    em que esse elemento aparece. Se não existir o elemento no vetor,
    apresentar uma mensagem.
*/

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int vet[] = new int[15]; //cria o vetor
        int elemento =0;
        System.out.println("digite os elementos ");
        for(int i=0; i<15; i++){
            vet[i]= entrada.nextInt();
        }
        Arrays.sort(vet);// ordena o vetor

        System.out.println("elementos em ordem crecente ");
        for(int i=0; i<15; i++){
            System.out.println(vet[i]);
        }
        System.out.println("digite o elemento que deseja buscar ");
        elemento = entrada.nextInt();

        int  indice = Arrays.binarySearch(vet,elemento);// localiza uma posição no vetor

        if (vet[indice] == elemento){
            System.out.println("elemento " + elemento + " esta na pocisao " + indice);
        }else{
            System.out.println("elemento não encontrado");
        }
    }
}




