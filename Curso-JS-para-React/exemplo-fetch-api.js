async function buscarUsuario() {
  try {
    // 1. Fazendo o "pedido" (Requisição)
    const resposta = await fetch('https://jsonplaceholder.typicode.com/users/1');

    // 2. Verificando se o "entregador" encontrou o endereço
    if (!resposta.ok) {
      throw new Error("Usuário não encontrado!");
    }

    // 3. Transformando o pacote bruto em algo compreensível (JSON)
    const dados = await resposta.json();

    // 4. Usando os dados
    console.log(`Nome do usuário: ${dados.name}`);
    console.log(`Email: ${dados.email}`);

  } catch (erro) {
    // Se a internet cair ou a URL estiver errada, o erro cai aqui
    console.error("Erro na busca:", erro);
  }
}

// Chama a função
buscarUsuario();