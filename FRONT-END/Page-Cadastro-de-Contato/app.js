'use strict'

import { getContato, postContato,putContato,deleteContato } from "./contatos.js";
const novoContato={
            "nome": "AUX",
            "celular": "11 9 8922-4002",
            "foto": "https://img.freepik.com/psd-gratuitas/renderizacao-3d-do-estilo-de-cabelo-para-o-design-do-avatar_23-2151869121.jpg",
            "email": "teste@gmail.com",
            "endereco": "Av. cre, 234",
            "cidade": "Sorocaba"
            }
        
console.log(await deleteContato(39))
// console.log(await getContato())