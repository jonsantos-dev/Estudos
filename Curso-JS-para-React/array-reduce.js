// Muito utilizado para reduzir o array em um único elemento
// Reduce é tão versátil que consegue fazer a função do filter e map também, embora isso não seja recomendada.

const numeros = [5, 50, 80, 1, 2, 3, 5, 8, 7, 11, 15, 22, 27];

//Obs: o primeiro parametro na função calbback do reduce é um acumulador e depois os demais, então seria: acumulador, valor, indice, array. Além disso, podemos definir o valor inicial do acumulador conforme exemplo abaixo.

// Some todos os números (reduce)

    // const total = numeros.reduce(function(acumulador, valor, indice, array){
    //     acumulador += valor;
    //     return acumulador;
    // }, 0);
    // console.log(total);


// Retorne um array com os pares (Filter)

    // const total = numeros.reduce(function(acumulador, valor, indice, array){
    //     if (valor % 2 == 0) {
    //         acumulador.push(valor);
    //     }
    //     return acumulador;
    // }, []);
    // console.log(total);

// Retorne um array com o dobro dos valores (Map)

    // const total = numeros.reduce(function(acumulador, valor){
    //         acumulador.push(valor * 2);
    //     return acumulador;
    // }, []);
    // console.log(total);


// Retorne a pessoa mais velha

const pessoas = [
    { nome: 'Luiz', idade: 62},
    { nome: 'Maria', idade: 23 },
    { nome: 'Eduardo', idade: 55 },
    { nome: 'Leticia', idade: 19 },
    { nome: 'Rosana', idade: 32 },
    { nome: 'Wallace', idade: 47 },
]

const maisVelha = pessoas.reduce(function(acumulador, valor){
    if(acumulador.idade > valor.idade) return acumulador;
    return valor;
});
console.log(maisVelha);