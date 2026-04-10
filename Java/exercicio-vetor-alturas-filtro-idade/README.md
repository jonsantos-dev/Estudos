# Exercício: Alturas (POO + Vetores)

Este programa realiza o cadastro de um grupo de pessoas, coletando nome, idade e altura. O sistema calcula estatísticas sobre o grupo, como a média de altura e a porcentagem de jovens com menos de 16 anos, listando também os nomes desses jovens.

## 📋 Funcionalidades

- Cadastro dinâmico de múltiplas pessoas com entrada de dados via terminal.
- Cálculo automático da **altura média** de todo o grupo.
- Filtragem e listagem de nomes das pessoas com **menos de 16 anos**.
- Cálculo percentual de jovens no grupo com exibição formatada.

## 🚀 Conceitos Aplicados

- **POO (Programação Orientada a Objetos)**: Implementação da classe `Pessoa` no pacote `entities` com atributos privados e métodos de acesso (Getters/Setters).
- **Arrays Paralelos**: Gerenciamento de múltiplos vetores (`String`, `double`, `int`) sincronizados por índice para armazenar os dados dos objetos.
- **Acumuladores e Contadores**: Lógica para somar as alturas e contar a quantidade de pessoas que atendem a um critério de idade.
- **Interatividade e Buffer**: Uso de `Scanner` com tratamento de buffer (`nextLine()`) e configuração de `Locale` para padrões internacionais.

## 🛠️ Tecnologias

- Java 17
- Visual Studio Code
- Git Bash