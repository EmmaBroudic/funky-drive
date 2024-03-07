import { fetchData } from './lib';

export async function getPokemonById(id) {
    const data = await fetchData(`http://localhost:8080/user/{id}`);

    return data;
}