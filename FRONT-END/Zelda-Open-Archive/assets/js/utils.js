/**
 * Módulo de Utilitários
 * Funções puras e auxiliares.
 */

/**
 * Traduz as categorias da API para Português.
 * @param {string} category 
 * @returns {string}
 */
export const translateCategory = (category) => {
    const translations = {
        equipment: "Equipamentos",
        monsters: "Monstros",
        creatures: "Criaturas",
        materials: "Materiais",
        treasure: "Tesouros"
    };
    return translations[category] || category;
};

/**
 * Sanitiza strings para uso em URLs de busca.
 * @param {string} str 
 * @returns {string}
 */
export const sanitizeSearch = (str) => 
    str.trim().toLowerCase().replace(/\s+/g, "_");

/**
 * Cria um elemento DOM com segurança (evitando innerHTML).
 * @param {string} tag 
 * @param {Object} attributes 
 * @param {Array|string} children 
 * @returns {HTMLElement}
 */
export const createElement = (tag, attributes = {}, children = []) => {
    const element = document.createElement(tag);
    
    Object.entries(attributes).forEach(([key, value]) => {
        if (key === "className") {
            element.className = value;
        } else if (key.startsWith("on") && typeof value === "function") {
            element.addEventListener(key.substring(2).toLowerCase(), value);
        } else {
            element.setAttribute(key, value);
        }
    });

    if (typeof children === "string") {
        element.textContent = children;
    } else if (Array.isArray(children)) {
        children.forEach(child => {
            if (child) element.appendChild(child);
        });
    }

    return element;
};
