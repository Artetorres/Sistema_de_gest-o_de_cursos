# 📚 Sistema de Gestão de Cursos

Este é um projeto Java conceitual que demonstra a aplicação de pilares da Programação Orientada a Objetos (POO) para criar a estrutura básica de um sistema de gerenciamento de cursos, alunos e instrutores.

## 📐 Conceitos de POO Aplicados

O foco principal deste projeto é a correta estruturação de classes e seus relacionamentos:

* **Herança (Classe Abstrata):** A classe `Pessoa` é definida como `abstract`, servindo como base para `Aluno` e `Instrutor`. Ela centraliza atributos comuns (nome, email) e define um contrato de método abstrato (`exibirInfo()`) que as subclasses são forçadas a implementar.
* **Polimorfismo:** `Aluno` e `Instrutor` fornecem implementações diferentes para o método `exibirInfo()`, demonstrando polimorfismo de sobrescrita.
* **Interface:** A interface `Certificavel` define um contrato (`emitirCertificado`) que pode ser implementado por qualquer classe que deva ter a capacidade de emitir certificados. No caso, a classe `Curso` implementa esta interface.
* **Composição e Agregação:**
    * A classe `Curso` *é composta* por um `Instrutor` (instrutor responsável).
    * A classe `Curso` *agrega* uma lista de `Aluno`.

## 📂 Estrutura do Projeto

* **`Pessoa.java`**: Classe abstrata base para `Aluno` e `Instrutor`.
* **`Aluno.java`**: Subclasse de `Pessoa`, representa um estudante.
* **`Instrutor.java`**: Subclasse de `Pessoa`, representa um instrutor.
* **`Curso.java`**: Classe principal que gerencia um curso, seu instrutor e a lista de alunos matriculados.
* **`Certificavel.java`**: Interface que define o método `emitirCertificado(Aluno a)`.
* **`Main.java`**: Classe de exemplo que instancia as classes para demonstrar a estrutura (não possui interação de usuário).

## 🚀 Como Executar

Este projeto é primariamente um modelo de classes. A classe `Main` serve apenas para instanciar os objetos e demonstrar que a estrutura funciona.

1.  Certifique-se de ter o Java JDK instalado.
2.  Navegue até a pasta raiz do projeto.
3.  Compile todos os arquivos `.java`:
    ```bash
    javac *.java
    ```
4.  Execute a classe `Main`:
    ```bash
    java Main
    ```
(A execução atual não produzirá uma saída significativa no console, pois o `Main` apenas constrói os objetos e o método `emitirCertificado` está incompleto).
