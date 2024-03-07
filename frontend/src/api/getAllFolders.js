import { fetchData } from './lib';

export async function getAllFolders() {
    const data = await fetchData("http://localhost:8080/folder");

    console.log(data);

    return data;
}