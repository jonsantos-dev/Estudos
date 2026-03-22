//Array map altera valores do array, ou seja, retorna um array do mesmo tamanho do original só que com tamanhos alterados

// const numeros = [5, 50, 80, 1, 2, 3, 5, 8, 7, 11, 15, 22, 27];

// const numeroEmDobro = numeros.map(function(valor){
//     return valor * 2;
// });
// console.log(numeroEmDobro)

// Para cada elemento:
// Retorne apenas uma string com o nome da pessoa
// Remova apenas a chave "nome" do objeto
// Adicione uma chave id em cada objeto
const pessoas = [
    { nome: 'Luiz', idade: 62},
    { nome: 'Maria', idade: 23 },
    { nome: 'Eduardo', idade: 55 },
    { nome: 'Leticia', idade: 19 },
    { nome: 'Rosana', idade: 32 },
    { nome: 'Wallace', idade: 47 },
]
// Retorne apenas uma string com o nome da pessoa
    // const apenasNome = pessoas.map(obj => obj.nome);
    // console.log(apenasNome);

// Remova apenas a chave "nome" do objeto
// Maneira 1: Usando o delete
    // const semNome = pessoas.map(function(obj){
    //     delete obj.nome;
    //     return obj;
    // })
    // console.log(semNome);

//Maneira 2: Criando um novo objeto, usando apenas a chave idade
    // const semNome = pessoas.map(function(obj){
    //     return {idade: obj.idade};
    // });
    // console.log(semNome);

// Adicione uma chave id em cada objeto

const comIds = pessoas.map(function(obj, indice){
    obj.id = (indice+1);
    return obj;
});
console.log(comIds)