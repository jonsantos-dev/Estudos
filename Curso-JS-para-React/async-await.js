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
// esperaAi('Frase 1', rand(1, 3))
// .then(resposta => {
//     console.log(resposta);
//     return esperaAi('Frase 2', rand(1, 3));
// })
// .then(resposta => {
//     console.log(resposta);
//     return esperaAi('Frase 3', rand(1, 3))
    
// }).then(resposta => {
//     console.log(resposta);
// })
// .catch(); //Sempre que chamarmos o reject o catch é executado

async function executa(){
    const fase1 = await esperaAi('Fase 1', rand());
    console.log(fase1);

    const fase2 = await esperaAi('Fase 2', rand());
    console.log(fase2);

    const fase3 = await esperaAi('Fase 3', rand());
    console.log(fase3);

    console.log('Terminamos na fase ', fase3);
}
executa();