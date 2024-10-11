# Projetos Java Simples

Este repositório contém uma coleção de programas Java simples que demonstram conceitos básicos da linguagem, incluindo entrada/saída, estruturas de controle, classes e objetos.  Cada programa é independente e aborda um problema específico.

## Lista de Programas:

* **CalculoArea.java:** Calcula a área de um quadrado ou círculo com base na entrada do usuário.  Demonstra o uso da estrutura `switch` para seleção de opções.
* **ContaBancaria.java:** Simula operações básicas de uma conta bancária, como consultar saldo, receber e transferir valores.  Utiliza um loop `while` para interação com o usuário.
* **Fatorial.java:** Calcula o fatorial de um número inteiro fornecido pelo usuário.  Demonstra o uso do loop `for`.
* **ParImpar.java:** Determina se um número inteiro fornecido pelo usuário é par ou ímpar.  Demonstra o uso do operador módulo (`%`).
* **Titulo.java e Teste.java:** Demonstram a criação e utilização de classes e objetos em Java.  `Titulo` representa um título (como de um filme) com nome e ano de lançamento, e `Teste` utiliza a classe `Titulo`.  Demonstra encapsulamento, construtores e o método `toString()`.
* **Main.java:** Contém o método principal para testar as classes `Titulo` e `Teste`.

## Como Executar:

Cada programa pode ser compilado e executado a partir da linha de comando usando um compilador Java (como o JDK).  Por exemplo, para compilar e executar `Fatorial.java`:

1. **Compilar:** `javac Fatorial.java`
2. **Executar:** `java Fatorial`

Repita o processo para os demais programas.


## Observações:

* Os programas utilizam a classe `Scanner` para entrada de dados do usuário.
* A formatação de strings com `.formatted()` é utilizada em `ContaBancaria.java` para melhorar a legibilidade da saída.
* A classe `Titulo` demonstra princípios de encapsulamento com atributos privados e métodos getters.
* O programa `CalculoArea` utiliza um valor fixo para pi.


## Próximos Passos:

* Adicionar tratamento de exceções para entradas inválidas.
* Implementar testes unitários para garantir a funcionalidade correta dos programas.
* Expandir a funcionalidade dos programas, por exemplo, adicionando mais operações à `ContaBancaria`.
* Explorar diferentes estruturas de dados e algoritmos.


Este repositório serve como um ponto de partida para aprender programação Java. Sinta-se à vontade para modificar e experimentar com o código.
