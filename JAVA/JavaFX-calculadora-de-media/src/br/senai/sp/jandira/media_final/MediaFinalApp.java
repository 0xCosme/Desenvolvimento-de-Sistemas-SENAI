package br.senai.sp.jandira.media_final;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.border.Border;
import java.awt.event.ActionEvent;

public class MediaFinalApp extends Application {

    public static void main(String[] args) {
        launch(args);


    }
    @Override
    public void start(Stage stage) throws Exception {
        //determinar tamanho do stage
        stage.setWidth(700);
        stage.setHeight(500);
        //determina titulo da janela
        stage.setTitle("Media Final");

        //painel raiz/root//////////////////////////////////////////////////////////////////
        BorderPane root = new BorderPane();

        Label labelTitulo = new Label();
        labelTitulo.setText("Escola Prof. Vicente Amato");
        labelTitulo.setStyle("-fx-text-fill: #005AFF; -fx-font-size:32;-fx-font-weight:bold;");
        labelTitulo.setPadding(new Insets(10,0,10,5));


        // Painel de Resultado  de baixo////////////////////////////////////////////////
        VBox painelResultado = new VBox();
        painelResultado.setPadding(new Insets(0,0, 10,10));
        Label labelAluno = new Label("nome do aluno") ;
        Label labelMediaFinal = new Label("Media Final") ;
        Label labelSituacao = new Label("Situação") ;
        painelResultado.getChildren().addAll(labelAluno,labelMediaFinal,labelSituacao);


        //painel de botoes//////////////////////////////////////////////////

        //caixa onde vai os botao
        VBox painelDeBotoes = new VBox();
        painelDeBotoes.setPadding(new Insets(0,10, 10,0)); //
        painelDeBotoes.setSpacing(10);

        // cria os botao
        Button buttonCalculaMedia = new Button("Calcula media");
        Button buttonLimpar = new Button("Limpar");
        Button buttonSair = new Button("Sair");

        // define tamanho dos botao
        buttonLimpar.setPrefWidth(100);
        buttonCalculaMedia.setPrefWidth(100);
        buttonSair.setPrefWidth(100);

        buttonLimpar.setPrefHeight(20);

        //poem os botao na caixa que vai os botao declarada acima
        painelDeBotoes.getChildren().addAll(buttonCalculaMedia,buttonLimpar,buttonSair);



        //Painel Formulario/////////////////////////////////////////////////////////////////////////////
        VBox painelFormulario = new VBox();
        painelFormulario.setPadding(new Insets(0,0, 10,10));
        Label labelnome = new Label("nome do aluno");
        Label labelnota1 = new Label("nota 1");
        Label labelnota2 = new Label("nota 2");
        Label labelnota3 = new Label("nota 3");
        Label labelnota4 = new Label("nota 4");

        TextField textFieldNome = new TextField();
        TextField textFielNota1 = new TextField();
        TextField textFielNota2 = new TextField();
        TextField textFielNota3 = new TextField();
        TextField textFielNota4 = new TextField();
        painelFormulario.getChildren().addAll(
                labelnome,textFieldNome,
                labelnota1,textFielNota1,
                labelnota2,textFielNota2,
                labelnota3,textFielNota3,
                labelnota4,textFielNota4

        );

        // joga os itens no painel princial
        root.setTop(labelTitulo);
        root.setBottom(painelResultado);
        root.setRight(painelDeBotoes);
        root.setLeft(painelFormulario);



        Scene scene = new Scene(root);
        stage.setScene(scene);
        //mostra tela/stage
        stage.show();

        //eventos de click dos botao


        // -> funcao lambda funcao seta
        buttonCalculaMedia.setOnAction( click->{
            System.out.println("botao clicado");

            String nomeDigitado = textFieldNome.getText();
            labelAluno.setText("Nome do aluno: "+nomeDigitado);

            //calcular media
            //obter nota
            double[] notas  = new double[4];

            // cria variavel nota e ela recebe o conversor pra double e ele recebe a string
            notas[0] = Double.parseDouble(textFielNota1.getText()); //transforma s string em um double

            // recebe uma string
            String nota2str = textFielNota2.getText();
            //converte em double
            notas[1] = Double.parseDouble(nota2str);

            notas[2] = Double.parseDouble(textFielNota3.getText());
            notas[3] = Double.parseDouble(textFielNota4.getText());

            //loop while
            int aux =0;
            double mediaFinal=0;



            while (aux < notas.length){

                mediaFinal = mediaFinal+notas[aux];
                if (aux <notas.length){
                    mediaFinal = mediaFinal/notas.length;
                }
                aux ++;
            }








            String mediafinalstr = String.format("%.2f", mediaFinal);
            labelMediaFinal.setText("media final: "+ mediafinalstr);

            if (mediaFinal <= 4){
                labelSituacao.setText("Situaçao: Reprovado");
            }else if (mediaFinal >4  && mediaFinal <6){
                labelSituacao.setText("Situaçao: Recuperação");
            }else {
                labelSituacao.setText("Situaçao: Aprovado");
            }



        });

    }
}
