# Projeto: Gerador de Tabuada com JavaFX

## Descrição

Este projeto é uma aplicação desktop desenvolvida em Java utilizando JavaFX para gerar tabuadas de forma dinâmica.

O usuário pode informar o número base (multiplicando) e definir um intervalo de valores para os multiplicadores. O resultado é exibido em uma lista na interface gráfica.

---

## Funcionalidades

* Interface gráfica com JavaFX
* Entrada de dados para cálculo da tabuada
* Definição de intervalo (mínimo e máximo)
* Exibição dos resultados em lista
* Botão para calcular a tabuada

---

## Tecnologias Utilizadas

* Java
* JavaFX

---

## Estrutura do Projeto

```id="m8x3qp"
📁 projeto
└── HelloApplication.java
```

---

## Como Executar

1. Compile o projeto (certifique-se de ter o JavaFX configurado):

```bash id="z1k7ls"
javac HelloApplication.java
```

2. Execute:

```bash id="p9v2qn"
java HelloApplication
```

---

## Exemplo de Uso

* Digite o valor do multiplicando (ex: 5)
* Informe o menor multiplicador (ex: 1)
* Informe o maior multiplicador (ex: 10)
* Clique em "Calcular"

Resultado esperado:

```id="r5n4tx"
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
...
5 x 10 = 50
```

---

## Observações

* O programa ajusta automaticamente caso o valor mínimo seja maior que o máximo
* Os resultados são acumulados na lista (não são limpos automaticamente)
* Não há validação para entradas inválidas (ex: texto no lugar de número)


