// Função que injeta o conteúdo da home diretamente
const urlApi = "https://lion-school-phbo.onrender.com/"

async function cursos() {
    const response = await fetch(urlApi+"cursos")
    const curso = await response.json();

    return curso
}

async function carregarHome() {
    //aqui exixte o id cursis no html
    const htmlcursos = document.getElementById('cursos');

    //chama a funcao que vai ter todos os cursos
    const listaCursos = await cursos()
     
    // percorer cursos 
    listaCursos.forEach(curso => {
        //aqui criar as div que ficara 1 curso
        const divCurso = document.createElement("div")

         divCurso.classList.add(
            "bg-[#3347B0]",
            "text-4xl",
            "w-170",
            "h-70",
            "p-4",
            "rounded-lg",
            "flex",
            "items-center",
            "gap-6",
            "flex-row",
            "justify-center",
            "items-center",

            //texto
            "text-white",
            "font-bold",
            "text-8xl",

            //sombra
            "rounded-none",
            "shadow-[12px_10px_0px_rgba(51,71,176,0.35)]"
        );

        // Cria a imagem
        const imagem = document.createElement("img");
        imagem.src = curso.icon;
        imagem.alt = curso.nome;
        imagem.classList.add(
            "w-42",
            "h-42",
            "object-contain",
            "invert"
        )

        // Cria a sigla
        const sigla = document.createElement("h2");
        sigla.textContent = curso.sigla;

        // Adiciona os elementos na div
        divCurso.appendChild(imagem);
        divCurso.appendChild(sigla);

        htmlcursos.appendChild(divCurso)

    });

}
// chama a função assim que o arquivo for carregado
carregarHome();


