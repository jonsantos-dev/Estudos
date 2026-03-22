// Promises 
function rand(min, max){
    min *= 1000;
    max *= 1000;
    return Math.floor(Math.random() * (max - min) + min);
}
function esperaAi(msg, tempo) {
    return new Promise((resolve, reject) => {

        setTimeout(() => {
        resolve(msg); //Sempre que chamarmos o resolve o then é executado
        },tempo);

    });
}
esperaAi('Frase 1', rand(1, 3))
.then(resposta => {
    console.log(resposta);
    return esperaAi('Frase 2', rand(1, 3));
})
.then(resposta => {
    console.log(resposta);
    return esperaAi('Frase 3', rand(1, 3))
    
}).then(resposta => {
    console.log(resposta);
})
.catch(); //Sempre que chamarmos o reject o catch é executado