//como fazer requisição http via javascript



function convertpokemonToHtml(pokemon){
    return `
    <li class="pokemon">
    <span class="number">#001</span>
    <span class="name">${pokemon.name}</span>
    <div class="detail">
        <ol class="types">
            <li class="type">grass</li>
            <li class="type">poison</li>
        </ol>
        <img src="https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/other/dream-world/5.svg" alt="${pokemon.name}" srcset="">
    </div>
    
</li>
    `
}

const pokemonList = document.getElementById('pokemonList')

pokeApi.getPokemon()
   
.then((pokemons)=>{
    const listItens = []
    pokemons.map()
    for (let i = 0; i < pokemons.length; i++) {
        const pokemon = pokemons[i];
        listItens.push(convertpokemonToHtml(pokemon))
        
        
    }
    console.log(listItens); 
})
.catch((error)=> console.log(error))



// fetch(url)
// .then((response) =>{
//      return response.json()
// })
// .then((jsonBody)=>{
//     console.log(jsonBody);
// })
// .catch(function(error){
//     console.error('deu erro na req')
// })
// .finally(function(){
//     console.log("Requisição concluída")
// })


// fetch(url)
//   .then(response => {
//     if (!response.ok) {
//       throw new Error('Erro na requisição');
//     }
//     return response.json();
//   })
//   .then(data => {
//     // Faça algo com os dados obtidos da resposta
//     console.log(data);
//   })
//   .catch(error => {
//     console.error('Erro:', error);
//   });
// console.log('ola ');