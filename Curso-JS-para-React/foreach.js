const a1 = [10, 20, 30];
// Simulando um reduce (não recomendado devido a performance do reduce ser melhor)
let total = 0;
a1.forEach(valor => {
    total += valor;
})
console.log(total);


// a1.forEach(function(valor, indice, array){
//     console.log(valor, indice);
// })