// // Classes tem a mesma função, da função construtor, mudando apenas a forma de escrever
// class Pessoa {
//     constructor(nome, sobrenome){
//         this.nome = nome;
//         this.sobrenome = sobrenome;
//     }
//     // Colocando um método no prototype
//     falar(){
//         console.log(`${this.nome} está falando.`);
        
//     }
// }

// const p1 = new Pessoa('Luiz', 'Miranda');
// const p2 = new Pessoa('Maria', 'Santos');
// p1.falar();
// p2.falar();

// EXEMPLO COM FUNÇÃO CONSTRUTORA
function Pessoa2(nome, sobrenome){
    this.nome = nome;
    this.sobrenome = sobrenome;
}

Pessoa2.prototype.falar = function(){
    console.log(`${this.nome} está falando.`);
}

const p1 = new Pessoa2('Rafa', 'Rezende');
const p2 = new Pessoa2('Jon', 'Santos');
p1.falar();
console.log(p2);