// Passe o valor de B para A de C para B e de C para A, sem criar uma variável auxiliar

a = 'a';
b = 'b';
c = 'c';

const letras = [b, c, a];
[a, b, c] = letras;

console.log(a, b, c)
// console.log(numeros)