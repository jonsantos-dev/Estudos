# 🚀 Projeto: Gestão de Funcionários com Java Streams

Este projeto faz parte dos meus estudos de Java, focado na manipulação de coleções dinâmicas (`ArrayList`) e no uso da API de Streams para validação e busca de dados.

## 🛠️ Funcionalidades

- **Cadastro Dinâmico**: Permite definir a quantidade de funcionários a serem inseridos.
- **Validação de ID Único**: Utiliza `.stream().anyMatch()` para garantir que nenhum ID seja duplicado durante o cadastro.
- **Busca e Atualização**: Localiza um funcionário específico por ID usando `.stream().filter().findFirst()` para aplicar aumentos salariais.
- **Tratamento de Escopo**: Implementação de lógica para garantir que variáveis locais sejam "effectively final" para uso em expressões Lambda.

## 📚 Conceitos Aprendidos

### 1. Java Streams API
Aprendi a utilizar a "esteira de processamento" do Java para:
*   **Filtrar** dados de forma declarativa.
*   **Localizar** referências de objetos dentro de listas sem usar loops `for` manuais complexos.

### 2. Escopo e Inicialização
*   **Definite Assignment**: A importância de inicializar variáveis locais para evitar erros de compilação.
*   **Effectively Final**: Por que variáveis usadas dentro de lambdas não podem ter seu valor alterado após a criação.

### 3. Collections Framework
*   Diferença entre **Arrays estáticos** e **ArrayLists dinâmicos**.
*   Importância de persistir objetos na lista usando `.add()` para que as buscas subsequentes funcionem.

## 💻 Como rodar o projeto
1. Certifique-se de ter o JDK 17 ou superior instalado.
2. Clone o repositório.
3. Abra a pasta no **VS Code**.
4. Execute o arquivo `App.java`.

## ⚙️ Tecnologias
- Java 25
- Visual Studio Code
- Git/GitHub