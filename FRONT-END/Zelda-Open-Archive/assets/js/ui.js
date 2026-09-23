/**
 * Módulo de Interface (UI)
 * Responsável por manipular o DOM e renderizar componentes.
 */
import { createElement, translateCategory } from './utils.js';

const modal = document.getElementById("modal");
const modalImage = document.getElementById("modalImage");
const modalTitle = document.getElementById("modalTitle");
const modalContent = document.getElementById("modalContent");
const itemsContainer = document.getElementById("itemsContainer");

/**
 * Abre o modal com detalhes do item.
 * @param {Object} item 
 */
export const openModal = (item) => {
    modal.classList.remove("hidden");
    modalImage.src = item.image;
    modalImage.alt = item.name;
    modalTitle.textContent = item.name;

    // Limpa conteúdo anterior com segurança
    modalContent.textContent = "";

    const details = [
        { label: "Categoria", value: translateCategory(item.category) },
        { label: "Descrição", value: item.description },
        { label: "Localizações", value: item.common_locations?.join(", ") || "Desconhecido" },
        { label: "Drops", value: item.drops?.join(", ") || "Nenhum" }
    ];

    details.forEach(detail => {
        const p = createElement("p", {}, [
            createElement("span", { className: "font-bold text-white mr-2" }, `${detail.label}:`),
            document.createTextNode(detail.value || "N/A")
        ]);
        modalContent.appendChild(p);
    });
};

/**
 * Fecha o modal.
 */
export const closeModal = () => {
    modal.classList.add("hidden");
};

/**
 * Renderiza a lista de itens no container.
 * @param {Array} items 
 */
export const renderItems = (items) => {
    itemsContainer.textContent = "";

    if (!items || items.length === 0) {
        itemsContainer.appendChild(
            createElement("p", { className: "text-center text-2xl col-span-full" }, "Nenhum item encontrado.")
        );
        return;
    }

    items.forEach(item => {
        const card = createElement("div", {
            className: "glass rounded-2xl overflow-hidden cursor-pointer hover:scale-105 duration-300 fade-in",
            onClick: () => openModal(item)
        }, [
            createElement("img", {
                src: item.image,
                alt: item.name,
                className: "w-full h-64 object-cover",
                loading: "lazy"
            }),
            createElement("div", { className: "p-4" }, [
                createElement("h3", { className: "text-2xl capitalize" }, item.name)
            ])
        ]);

        itemsContainer.appendChild(card);
    });
};

/**
 * Exibe mensagem de carregamento.
 */
export const showLoading = () => {
    itemsContainer.textContent = "";
    itemsContainer.appendChild(
        createElement("p", { className: "text-center text-2xl col-span-full" }, "Carregando...")
    );
};
