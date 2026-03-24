# 📐 Tabuada Polimórfica em Java

Atividade prática da disciplina de **Análise e Desenvolvimento de Sistemas** — refatoração de um sistema de tabuada aplicando o conceito de **polimorfismo** em Java.

---

## 📌 Sobre o Projeto

Este programa recebe um número base e uma operação matemática escolhida pelo usuário, e exibe a tabuada de 1 a 10 utilizando um **único método polimórfico** para realizar todos os cálculos — sem métodos separados para cada operação.

---

## 🧠 O que é Polimorfismo?

> *"Poly" = muitos | "Morphos" = formas*

Polimorfismo é um dos quatro pilares da **Programação Orientada a Objetos (POO)**. Ele permite que um mesmo método se comporte de formas diferentes dependendo dos argumentos recebidos ou da classe que o implementa.

### Tipos utilizados neste projeto:

| Tipo | Nome técnico | Como foi aplicado |
|------|-------------|-------------------|
| Polimorfismo em tempo de **compilação** | Sobrecarga (*Overloading*) | Dois métodos `calcular()` com parâmetros diferentes (`int` e `double`) |
| Polimorfismo por **parametrização** | — | Um único método decide a operação com base no parâmetro `String operacao` |

---

## ✅ Requisitos Atendidos

- [x] Classe `Operacao` com método `calcular(int a, int b, String operacao)`
- [x] Suporte às operações `+`, `-`, `*`, `/`
- [x] Tratamento de **divisão por zero**
- [x] Validação de **operação inválida**
- [x] Uso de `switch` no lugar de múltiplos `if`
- [x] **Sobrecarga** de método com versão para `double`
- [x] Opção de **repetir o programa**

---

## 📁 Estrutura do Projeto

```
📦 tabuada-polimorfica
 ┣ 📄 Operacao.java   → Classe com os métodos polimórficos calcular()
 ┗ 📄 Main.java       → Classe principal com a interface do usuário
```

---

## 🔍 Como o Polimorfismo foi Aplicado

### 1. Método único para 4 operações

Em vez de ter `somar()`, `subtrair()`, `multiplicar()` e `dividir()`, foi criado um único método:

```java
public double calcular(int a, int b, String operacao) {
    switch (operacao) {
        case "+": return a + b;
        case "-": return a - b;
        case "*": return a * b;
        case "/": return (double) a / b;
        default:
            System.out.println("Operação inválida!");
            return 0;
    }
}
```

O `main` chama sempre o mesmo método — ele não precisa saber **como** a operação é feita:

```java
double resultado = op.calcular(numero, i, sinal); // polimorfismo aqui
```

### 2. Sobrecarga (Overloading)

O mesmo método existe em duas versões: uma para `int` e outra para `double`. O compilador escolhe automaticamente qual usar:

```java
op.calcular(5, 3, "*");         // → versão int
op.calcular(5.5, 2.0, "/");    // → versão double
```

---

## 💻 Como Executar

### Pré-requisitos
- Java JDK 8 ou superior instalado
- Terminal ou IDE (NetBeans, IntelliJ, VSCode)

### Pelo terminal

```bash
# Compilar
javac Main.java

# Executar
java Main
```

### Exemplo de uso

```
=== SISTEMA DE TABUADA POLIMÓRFICA ===

Digite o número base para a tabuada: 5
Digite a operação (+, -, *, /): *

--- RESULTADO ---
5 * 1 = 5.0
5 * 2 = 10.0
5 * 3 = 15.0
...
5 * 10 = 50.0

Deseja calcular outra tabuada? (S/N): N
Encerrando o sistema. Até logo!
```

---

## 💡 Pergunta Reflexiva

**Qual a vantagem de usar um único método polimórfico ao invés de vários métodos separados?**

Com um único método `calcular()`, o código principal não precisa se preocupar em chamar métodos diferentes para cada operação. Se amanhã surgir uma nova operação (como `%` para módulo), basta adicionar um `case` dentro do método — **sem alterar nada no `main`**. Isso deixa o código:

- **Mais limpo** — menos repetição de lógica
- **Mais fácil de manter** — mudanças em um único lugar
- **Mais extensível** — novas operações sem quebrar o que já existe

Esse princípio se chama **Open/Closed**: o código deve ser aberto para extensão, mas fechado para modificação.

---

## 👨‍💻 Autores

**Caio Vinicius , Daniel Oliveira, Maicon Santos e Kauan Marinho**  
Superior de Tecnologia em Análise e Desenvolvimento de Sistemas  
Centro Universitário Jorge Amado — Salvador, BA  
