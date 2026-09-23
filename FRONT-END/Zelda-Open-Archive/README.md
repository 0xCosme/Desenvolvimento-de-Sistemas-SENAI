# Zelda Open Archive

Este projeto é uma aplicação web interativa desenvolvida para explorar o vasto universo de The Legend of Zelda, utilizando dados da Hyrule Compendium API. Ele oferece uma maneira dinâmica e visualmente atraente de descobrir criaturas, monstros, materiais e equipamentos encontrados nos jogos da série.


## Funcionalidades

- **Exploração de Categorias:** Navegue por diferentes categorias (Equipamentos, Monstros, Criaturas, Materiais, Tesouros).
- **Pesquisa Dinâmica:** Busque itens específicos na API.
- **Detalhes de Itens:** Visualize informações detalhadas de cada item em um modal interativo.
- **Design Responsivo:** Interface adaptável a diferentes tamanhos de tela.
- **Efeitos Visuais:** Animações e efeitos de *glassmorphism* para uma experiência imersiva.

## Tecnologias Utilizadas

- **HTML5:** Estrutura semântica da página.
- **Tailwind CSS:** Framework CSS para estilização rápida e responsiva.
- **JavaScript (ES6+):** Lógica da aplicação, modularizada para melhor organização e manutenção.
- **Hyrule Compendium API:** Fonte de dados para os itens de Zelda.

## Estrutura do Projeto

O projeto foi organizado em uma estrutura modular para facilitar a manutenção e escalabilidade:

```
zelda-archive/
├── assets/
│   ├── css/
│   │   └── styles.css
│   └── js/
│       ├── api.js
│       ├── main.js
│       ├── ui.js
│       └── utils.js
└── index.html
└── README.md
```

- `index.html`: O arquivo HTML principal que estrutura a aplicação.
- `assets/css/styles.css`: Contém os estilos CSS personalizados, incluindo variáveis, animações e ajustes para o *glassmorphism*.
- `assets/js/api.js`: Módulo responsável por todas as interações com a Hyrule Compendium API, encapsulando as chamadas `fetch`.
- `assets/js/utils.js`: Módulo de funções utilitárias, como tradução de categorias, sanitização de strings e uma função segura para criação de elementos DOM (evitando `innerHTML`).
- `assets/js/ui.js`: Módulo dedicado à manipulação da interface do usuário (DOM), renderização de itens e gerenciamento do modal.
- `assets/js/main.js`: O módulo principal que orquestra a inicialização da aplicação, gerencia os ouvintes de eventos e integra os demais módulos.

## Contribuição

Sinta-se à vontade para explorar o código, sugerir melhorias ou relatar problemas. Contribuições são sempre bem-vindas!

## Licença

Este projeto está licenciado sob a licença MIT. Para mais detalhes, consulte o arquivo LICENSE (se disponível no projeto).




Zelda Open Archive - Desenvolvido para a comunidade de fãs de Zelda.





