// Filter 
// Observação: Filter sempre vai retornar um array com a mesma quantidade de elementos ou menos

//Exemplo 1
// Primeiro resolva o exercicio abaixo sem usar o filter
// Retorne em outro array os números maiores que 10

// const numeros = [5, 50, 80, 1, 2, 3, 5, 8, 7, 11, 15, 22, 27];
// const novoArray = [];

// numeros.forEach(element => {
//     if (element > 10){
//         novoArray.push(element);
//     }
// });

// console.log(novoArray);

// Filter 
// Retorne em outro array os números maiores que 10

// const todosNumeros = [5, 50, 80, 1, 2, 3, 5, 8, 7, 11, 15, 22, 27];

// //Chamado via arrow function
// const  numeroFiltrados = todosNumeros.filter(valor => valor > 10);
// console.log(numeroFiltrados)

//Exemplo 2
// Retorne as pessoas que tem o nome com 5 letras ou mais
// Retorne as pessoas com mais de 50 anos
// Retorne as pessoas cujo nome termina com a
const pessoas = [
    { nome: 'Luiz', idade: 62},
    { nome: 'Maria', idade: 23 },
    { nome: 'Eduardo', idade: 55 },
    { nome: 'Leticia', idade: 19 },
    { nome: 'Rosana', idade: 32 },
    { nome: 'Wallace', idade: 47 },
]

// RESOLUÇÃO SEM ARRAY FILTER

    // const nomes = [];
    // const idade50 = [];
    // const ultimaLetra = [];

    // function filtrarMinimoCaracteres(tamanho){
    //     pessoas.forEach(element => {
    //         if (element.nome.length >= tamanho) {
    //             nomes.push(element);
    //         }
    //     });
    //     console.log(`\nPessoas com ${tamanho} caracteres ou mais:`)
    //     return nomes;
    // }

    // function filtrarMinimoIdade(idade){
    //     pessoas.forEach(element => {
    //         if (element.idade > idade) {
    //             idade50.push(element);
    //         }
    //     });
    //     console.log(`\nPessoas com mais de ${idade} anos:`)
    //     return idade50;
    // }

    // function filtrarUltimaLetra(letra){
    //     pessoas.forEach(element => {
    //         ultimoCaractere = element.nome.slice(-1);
    //         if (ultimoCaractere == letra) {
    //             ultimaLetra.push(element);
    //         }

    //     });
    //     console.log(`\nPessoas com nomes terminados na letra ${letra}:`)
    //     return ultimaLetra
    // }

    // console.log(filtrarMinimoCaracteres(5));
    // console.log(filtrarMinimoIdade(50));
    // console.log(filtrarUltimaLetra("a"));

// Resolução com FILTER (forma padrão de função)

// const pessoasComNomeGrande = pessoas.filter(function(obj){
//     return obj.nome.length >= 5;
// });
// console.log(pessoasComNomeGrande)

// Resolução com FILTER (arrow function)

// Retorne as pessoas que tem o nome com 5 letras ou mais
const pessoasComNomeGrande = pessoas.filter(obj => obj.nome.length >= 5);
console.log("Nomes com 5 letras ou mais: \n", pessoasComNomeGrande);

// Retorne as pessoas com mais de 50 anos
const idadeMais50 = pessoas.filter(valor => valor.idade > 50);
console.log("\nPessoas com idade superior a 50: \n",idadeMais50);

// Retorne as pessoas cujo nome termina com a
const nomeTerminaComA = pessoas.filter(obj => obj.nome.slice(-1) == "a");
console.log("\nNomes terminado com A: \n",nomeTerminaComA)