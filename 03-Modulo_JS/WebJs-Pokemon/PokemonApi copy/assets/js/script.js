//como fazer requisição http via javascript

const limit = 10;
const offset = 0;
const url = `https://pokeapi.co/api/v2/pokemon?offset=${offset}&limit=${limit}`;

fetch(url)
.then((response) =>{
     return response.json()
})
.then((jsonBody)=>{
    console.log(jsonBody);
})
.catch(function(error){
    console.error('deu erro na req')
})
.finally(function(){
    console.log("Requisição concluída")
})


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