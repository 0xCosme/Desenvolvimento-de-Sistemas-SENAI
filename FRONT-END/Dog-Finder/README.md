# Galeria de Imagens de Cães

Este projeto é uma aplicação web simples que permite buscar e exibir imagens de cães com base na raça informada pelo usuário. As imagens são obtidas através de uma API pública e exibidas em formato de galeria responsiva.

## Demonstração

O usuário digita o nome de uma raça de cachorro no campo de busca e, ao clicar no botão, uma galeria de imagens é carregada dinamicamente na tela.

## Funcionalidades

- Busca de imagens por raça de cachorro
- Consumo de API externa
- Renderização dinâmica das imagens no DOM
- Layout responsivo em grid
- Interface moderna com efeitos visuais e animações

## Tecnologias utilizadas

- HTML5
- CSS3
- JavaScript (ES6+)
- API pública: DogAPI

## Estrutura do projeto

/
├── index.html
├── style.css
└── app.js


## Como usar

1. Digite o nome de uma raça de cachorro em inglês (por exemplo: labrador, husky, pug)
2. Clique no botão "buscar"
3. As imagens serão carregadas automaticamente na galeria

## Observações

- A API utilizada retorna as raças em inglês
- Caso uma raça inválida seja informada, nenhuma imagem será exibida
- É necessário conexão com a internet para o funcionamento da aplicação

## Possíveis melhorias

- Tratamento de erros para raças inválidas
- Indicador de carregamento (loading)
- Paginação ou limite de imagens exibidas
- Modal para visualização ampliada das imagens
- Campo de sugestão automática de raças

## Licença

Este projeto é de uso livre para fins de estudo e aprendizado.
