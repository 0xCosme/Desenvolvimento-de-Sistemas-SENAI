const URL = 'https://bakcend-fecaf-render.onrender.com/contatos'

export async function getContato() {
    const response = await fetch(URL)
    if(!response.ok)throw new Error('Erro ao buscar contatos')
   
    return response.json
}

export async function postContato(contato) {
    const options ={
        method: 'POST',
        headers:{
            'Content-Type':'application/json'
        },
        body: JSON.stringify(contato)
    }
    const response = await fetch(URL,options)
    if (!response.ok)throw new Error("erro ao criar contato")
    return response.json()
}

export async function putContato(id,contato) {
    const options ={
        method: 'PUT',
        headers:{
            'Content-Type':'application/json'
        },
        body: JSON.stringify(contato)
    }
    const response = await fetch(`${URL}/${id}`,options)
    if (!response.ok)throw new Error("erro ao atualizar contato")
    return response.json()
}

export async function deleteContato(id) {
    const options ={
        method: 'DELETE',
    }
    const response = await fetch(`${URL}/${id}`,options)
    if (!response.ok)throw new Error("erro ao apagar contato")
    return true
}