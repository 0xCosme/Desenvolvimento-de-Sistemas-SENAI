# Cadastro de Contatos

Aplicação web desenvolvida com HTML, JavaScript e Tailwind CSS para gerenciamento de contatos através de uma API REST.

## Objetivo

O projeto permite realizar operações de cadastro, consulta, atualização e exclusão de contatos utilizando requisições HTTP para uma API externa.

## Tecnologias Utilizadas

* HTML5
* JavaScript (ES Modules)
* Fetch API
* Tailwind CSS
* API REST

## Estrutura do Projeto

```text
projeto/
│
├── index.html
├── app.js
├── contatos.js
└── README.md
```

## Funcionalidades

* Listar contatos cadastrados
* Cadastrar novo contato
* Atualizar contato existente
* Excluir contato
* Interface responsiva utilizando Tailwind CSS

## Endpoint da API

```javascript
const URL = 'https://bakcend-fecaf-render.onrender.com/contatos'
```

## Métodos Disponíveis

### Buscar Contatos

```javascript
export async function getContato() {
    const response = await fetch(URL)

    if (!response.ok) {
        throw new Error('Erro ao buscar contatos')
    }

    return response.json()
}
```

### Cadastrar Contato

```javascript
export async function postContato(contato) {
    const options = {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(contato)
    }

    const response = await fetch(URL, options)

    if (!response.ok) {
        throw new Error('Erro ao criar contato')
    }

    return response.json()
}
```

### Atualizar Contato

```javascript
export async function putContato(id, contato) {
    const options = {
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(contato)
    }

    const response = await fetch(`${URL}/${id}`, options)

    if (!response.ok) {
        throw new Error('Erro ao atualizar contato')
    }

    return response.json()
}
```

### Excluir Contato

```javascript
export async function deleteContato(id) {
    const options = {
        method: 'DELETE'
    }

    const response = await fetch(`${URL}/${id}`, options)

    if (!response.ok) {
        throw new Error('Erro ao apagar contato')
    }

    return true
}
```

## Modelo de Contato

```json
{
  "nome": "AUX",
  "celular": "11 9 8922-4002",
  "foto": "https://img.freepik.com/psd-gratuitas/renderizacao-3d-do-estilo-de-cabelo-para-o-design-do-avatar_23-2151869121.jpg",
  "email": "teste@gmail.com",
  "endereco": "Av. cre, 234",
  "cidade": "Sorocaba"
}
```

## Interface

A aplicação possui um formulário para cadastro de contatos contendo os seguintes campos:

* Nome
* Link da Foto
* Telefone
* Email
* Endereço
* Cidade

Após o preenchimento, o usuário pode salvar o contato através do botão **Salvar Contato**.

Também existe uma área destinada à exibição da lista de contatos cadastrados.

## Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

2. Acesse a pasta do projeto:

```bash
cd seu-repositorio
```

3. Abra o arquivo `index.html` em um navegador ou utilize a extensão Live Server do VS Code.

## Correção Necessária

Na função `getContato()` o retorno está incorreto:

Código atual:

```javascript
return response.json
```

Código correto:

```javascript
return response.json()
```

Sem os parênteses o método não é executado, retornando apenas a referência da função.

---

Projeto desenvolvido para fins acadêmicos e estudo de consumo de APIs REST utilizando JavaScript.
