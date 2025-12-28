const prepararCafe = (pedido) => {
    // Retornamos uma nova Promise (o "comprovante")
    return new Promise((resolve, reject) => {
        console.log(`☕ Preparando seu ${pedido}...`);

        setTimeout(() => {
            const estoqueDisponivel = true; // Altere para 'false' para testar o erro

            if (estoqueDisponivel) {
                // Sucesso: entregamos o café
                resolve(`✅ Aqui está seu ${pedido}! Bom proveito.`);
            } else {
                // Falha: avisamos o motivo
                reject(`❌ Desculpe, não temos mais grãos para o ${pedido}.`);
            }
        }, 2000); // Espera 2 segundos
    });
};

// --- CONSUMINDO A PROMISE ---

prepararCafe("Expresso")
    .then((mensagem) => {
        // O código entra aqui se o resolve() for chamado
        console.log(mensagem);
    })
    .catch((erro) => {
        // O código entra aqui se o reject() for chamado
        console.log(erro);
    })
    .finally(() => {
        // Isso roda independente de ter dado certo ou errado
        console.log("🏪 Cafeteria: Processo finalizado.");
    });