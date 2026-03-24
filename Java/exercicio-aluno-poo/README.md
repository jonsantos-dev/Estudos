# Desafios e Aprendizados: Respeitando o SRP (Single Responsibility Principle)

O ponto mais desafiador e gratificante deste exercício foi a aplicação prática do **SRP**. Durante o desenvolvimento, reforcei o conceito de que cada classe e método deve possuir uma única responsabilidade, o que reflete diretamente na qualidade do código backend.

### 🚀 O que aprendi na prática:

* **Lógica de Negócio vs. Apresentação:** As classes de **Entity** (como `Student`) devem ser responsáveis estritamente pelo processamento e cálculo dos dados. Elas devem fornecer informações "puras", deixando para a classe `Program` a decisão de como exibir esses dados.
* **Flexibilidade e Reuso:** Ao evitar a formatação de saída (como `String.format`) dentro da entidade, garantimos que o dado seja versátil. Ele pode ser consumido por um console, uma API, um aplicativo mobile ou um banco de dados SQL, permitindo que cada interface formate a informação conforme sua necessidade.
* **Desacoplamento:** Manter a "estética" do código fora das entidades facilita a manutenção. Se o requisito de exibição mudar (ex: mudar de `$` para `R$` ou traduzir mensagens), não precisamos alterar a regra de negócio do sistema.

> "A entidade deve saber **o que** o dado é, mas não **como** ele deve aparecer para o usuário."