

const pokeApi = {}

pokeApi.getPokemonDetail = (pokemon)=>{
        return fetch(pokemon.url)
                .then((response)=> response.json())
}

pokeApi.getPokemon = (offset=0, limit=10)=>{
        const url = `https://pokeapi.co/api/v2/pokemon?offset=${offset}&limit=${limit}`;
        return fetch(url)
        .then((response)=>response.json())
        .then((jsonBody)=> jsonBody.results)
        //.catch((error)=> console.log(error))
        .then((pokemons)=> pokemons.map(pokeApi.getPokemonDetail))
        .then((detailRequest)=> Promise.all(detailRequest))
        .then((pokemonDetail)=> {
                console.log(pokemonDetail)
        })
}
//Array de promisses
// Promise.all([
//         fetch('https://pokeapi.co/api/v2/pokemon/1'),
//         fetch('https://pokeapi.co/api/v2/pokemon/2'),
//         fetch('https://pokeapi.co/api/v2/pokemon/3'),
//         fetch('https://pokeapi.co/api/v2/pokemon/4'),
// ]).then((results)=>{//a lista com o resultado das promise
//         console.log(results)
// })