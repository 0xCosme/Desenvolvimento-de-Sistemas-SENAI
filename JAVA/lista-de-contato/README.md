# Projeto: Manipulação de Contatos com Arquivo CSV em Java

## Descrição

Este projeto é uma aplicação em Java responsável por realizar a leitura e escrita de dados em um arquivo CSV.

A aplicação permite armazenar informações de contatos em arquivo e posteriormente recuperá-las para exibição no terminal.

---

## Funcionalidades

* Gravação de contatos em arquivo CSV
* Leitura de dados do arquivo
* Exibição formatada dos contatos no terminal
* Separação de dados utilizando delimitador (`;`)

---

## Tecnologias Utilizadas

* Java
* API NIO (`java.nio.file`) para manipulação de arquivos
* Estruturas de dados (`List`, `String`)

---

## Estrutura do Projeto

```id="n4x7qp"
📁 projeto
└── ContatoRepository.java
```

---

## Como Funciona

### Gravação de Dados

* Utiliza `Files.writeString()`
* Os dados do contato são convertidos em string no formato CSV
* O arquivo é atualizado com a opção `APPEND`, adicionando novos registros

### Leitura de Dados

* Utiliza `Files.readAllLines()` para carregar todas as linhas
* Cada linha é separada utilizando `split(";")`
* Os dados são exibidos de forma organizada no terminal

---

## Exemplo de Formato do CSV

```"
1;João Silva;11999999999;joao@email.com
2;Maria Souza;11888888888;maria@email.com
```

---

## Exemplo de Saída

```"
/////////////////////////////////////
NOME: João Silva
TELEFONE: 11999999999
EMAIL: joao@email.com
/////////////////////////////////////
```

---

## Observações

* O caminho do arquivo está fixo no sistema e pode precisar de ajuste
* Não há validação para evitar dados duplicados
* O programa depende de um objeto `Contato` previamente preenchido
* Não há tratamento detalhado para erros de leitura/escrita


