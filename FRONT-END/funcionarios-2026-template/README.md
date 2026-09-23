# Projeto: Lista de Funcionários

## Descrição

Este projeto é uma aplicação simples desenvolvida com HTML, CSS e JavaScript que exibe uma lista de funcionários em formato de cards dinâmicos.

Os dados dos funcionários são carregados a partir de um arquivo JSON, e os elementos são criados automaticamente via JavaScript, tornando a aplicação dinâmica e escalável.

---

## Funcionalidades

* Leitura de dados a partir de um arquivo JSON
* Criação dinâmica de elementos no DOM
* Exibição de imagem, nome e cargo de cada funcionário
* Renderização eficiente utilizando `replaceChildren`

---

## Tecnologias Utilizadas

* HTML5
* CSS3
* JavaScript (ES Modules)

---

## Estrutura do Projeto

```
📁 projeto
├── index.html
├── style.css
├── script.js
├── funcionarios.json
└── 📁 img
    └── (imagens dos funcionários)
```

---



## Observação

O projeto utiliza:

```js
import funcionarios from "./funcionarios.json" with { type: "json" }
```

Por isso, ele não funcionara abrindo o arquivo HTML diretamente no navegador — é necessário um servidor local pode ser resolvido com a extensao liveserve do vscode.


