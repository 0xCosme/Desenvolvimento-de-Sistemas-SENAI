import java.util.Scanner;

public class ConversordeMoedas {

    String moedaOrigem;
    String moedaDestino;

    double valorOrigem;
    double valorDestino;
    double conversao;


    public void ObterDados(){
        Scanner leitorInt = new Scanner(System.in);
        Scanner leitorString = new Scanner(System.in);

        System.out.println("Digite o nome da Sua moeda de origem: ");
        moedaOrigem  = leitorString.nextLine();

        System.out.println("Digite o valor moeda de origem: ");
        valorOrigem  = leitorInt.nextDouble();

        System.out.println("Digite o nome da Sua moeda de destino: ");
        moedaDestino  = leitorString.nextLine();

        System.out.println("Digite o valor moeda de destino: ");
        valorDestino  = leitorInt.nextDouble();

        ExibirResultado();
    }

    public void Calculo(){
        conversao = (valorOrigem / valorDestino);
    }


    public void ExibirResultado(){
        Calculo();
        System.out.println("*******************************************");
        System.out.println("nome da moeda de origem:   " + moedaOrigem );
        System.out.println("valor da moeda de origem:  " + valorOrigem );
        System.out.println("nome da moeda de destino:  " + moedaDestino);
        System.out.println("valor da moeda de destino: " + valorDestino);
        System.out.println("resultado:                 " + conversao);
        System.out.println("*******************************************");
    }

}
