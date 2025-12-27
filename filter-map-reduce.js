//Uniao do Filter, Map e Reduce
//Exercício: Retorne a soma do dobro de todos os pares
// 1 - Filtrar pares
// 2 - Dobrar os valores
// 3 - Reduzir (somar tudo)
const funcaoData = new Date();
const dataEHora = funcaoData.toLocaleString('pt-BR');

const numeros = [5, 50, 80, 1, 2, 3, 5, 8, 7, 11, 15, 22, 27];

const resultado = numeros
    .filter(valor => valor % 2 === 0) // Filtrando os pares
    .map(valor => valor * 2) // Dobrando o valor dos pares
    .reduce((acumulador, valor) => acumulador + valor); // somando tudo
console.log(resultado)

console.log(dataEHora)