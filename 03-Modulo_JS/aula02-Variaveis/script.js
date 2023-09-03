//variasi
let VouF = false;
console.log(typeof false)

let nume = 1;
console.log(typeof nume);
let array = ["item1", "item2" , "item3", "item4", true, "item 6"];
console.log(array[0]);

//forEach
array.forEach(function(item, index){
    console.log(index, item);
});
//push
array.push("novo item")
console.log(array);
//pop
array.pop();
console.log(array);
//shift
array.shift()
console.log(array);
array.unshift("novo item no nicio")
console.log(array);

//splice
array.splice(0, 3)//apaga
console.log(array);
//slice
array.slice(0, 3)
console.log(array);

var xicara = {
    cor: 'azul',
    tamanho: "p",
    funcao:"cafe"
}
console.log(xicara);
xicara.cor = " vermelha"
console.log(xicara);