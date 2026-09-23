/**
 * Módulo de API
 * Responsável por todas as requisições externas.
 */

const BASE_URL = "https://botw-compendium.herokuapp.com/api/v3/compendium";

/**
 * Busca itens por categoria.
 * @param {string} category 
 * @returns {Promise<Array>}
 */
export const fetchByCategory = async (category) => {
    try {
        const response = await fetch(`${BASE_URL}/category/${category}`);
        if (!response.ok) throw new Error("Erro ao buscar categoria");
        const { data } = await response.json();
        return data;
    } catch (error) {
        console.error("API Error (Category):", error);
        return [];
    }
};

/**
 * Busca um item específico pelo nome ou ID.
 * @param {string} entry 
 * @returns {Promise<Object|null>}
 */
export const fetchByEntry = async (entry) => {
    try {
        const response = await fetch(`${BASE_URL}/entry/${entry}`);
        if (!response.ok) throw new Error("Item não encontrado");
        const { data } = await response.json();
        return data;
    } catch (error) {
        console.error("API Error (Entry):", error);
        return null;
    }
};
