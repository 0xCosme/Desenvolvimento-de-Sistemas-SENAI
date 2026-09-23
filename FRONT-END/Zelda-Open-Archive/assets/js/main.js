/**
 * Módulo Principal
 * Orquestra a inicialização e os eventos globais.
 */
import { fetchByCategory, fetchByEntry } from './api.js';
import { renderItems, showLoading, closeModal } from './ui.js';
import { translateCategory, sanitizeSearch } from './utils.js';

// Seletores DOM
const explorarBtn = document.getElementById("explorarBtn");
const categoriasSection = document.getElementById("categoriasSection");
const listagemSection = document.getElementById("listagemSection");
const tituloCategoria = document.getElementById("tituloCategoria");
const voltarCategorias = document.getElementById("voltarCategorias");
const pesquisaInput = document.getElementById("pesquisa");
const fecharModalBtn = document.getElementById("fecharModal");
const categoriaCards = document.querySelectorAll(".categoria");

/**
 * Inicializa os ouvintes de eventos.
 */
const initEvents = () => {
    // Scroll suave para categorias
    explorarBtn.addEventListener("click", () => {
        categoriasSection.scrollIntoView({ behavior: "smooth" });
    });

    // Clique nas categorias
    categoriaCards.forEach(card => {
        card.addEventListener("click", async () => {
            const category = card.dataset.category;
            await loadCategory(category);
        });
    });

    // Pesquisa por nome (Enter)
    pesquisaInput.addEventListener("keydown", async (event) => {
        if (event.key === "Enter") {
            const query = sanitizeSearch(pesquisaInput.value);
            if (query) await searchItem(query);
        }
    });

    // Voltar para categorias
    voltarCategorias.addEventListener("click", () => {
        categoriasSection.scrollIntoView({ behavior: "smooth" });
    });

    // Fechar Modal
    fecharModalBtn.addEventListener("click", closeModal);
    
    // Fechar modal ao clicar fora (UX)
    window.addEventListener("click", (e) => {
        if (e.target.id === "modal") closeModal();
    });
};

/**
 * Carrega e renderiza uma categoria.
 * @param {string} category 
 */
const loadCategory = async (category) => {
    listagemSection.classList.remove("hidden");
    tituloCategoria.textContent = translateCategory(category);
    showLoading();
    
    listagemSection.scrollIntoView({ behavior: "smooth" });

    const data = await fetchByCategory(category);
    renderItems(data);
};

/**
 * Pesquisa um item específico.
 * @param {string} query 
 */
const searchItem = async (query) => {
    listagemSection.classList.remove("hidden");
    tituloCategoria.textContent = "Resultado da Pesquisa";
    showLoading();

    listagemSection.scrollIntoView({ behavior: "smooth" });

    const item = await fetchByEntry(query);
    renderItems(item ? [item] : []);
};

// Inicialização
document.addEventListener("DOMContentLoaded", initEvents);
