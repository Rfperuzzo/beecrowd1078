# Exercício 1078 – Tabuada | Java

## 📌 Descrição

Este projeto resolve o exercício **1078 – Tabuada**, da plataforma [Beecrowd](https://judge.beecrowd.com/pt/problems/view/1078).

O programa recebe um número inteiro `N` e apresenta sua tabuada de multiplicação de **1 até 10**, utilizando uma estrutura de repetição `for`.

## 🛠️ Tecnologias utilizadas

- Java
- Scanner para entrada de dados
- Estrutura de repetição `for`
- Operador de multiplicação `*`
- Concatenação de valores na saída

## 💻 Código-fonte

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i, n, resul;

        n = scanner.nextInt();

        for (i = 1; i <= 10; i++) {
            resul = i * n;
            System.out.println(i + " x " + n + " = " + resul);
        }
    }
}
```

## 🧠 Lógica do programa

1. O programa utiliza `Scanner` para ler um número inteiro `n`.
2. Declara as variáveis `i`, `n` e `resul`.
3. Inicia uma estrutura de repetição `for`, começando com `i = 1`.
4. A repetição continua enquanto `i <= 10`.
5. Em cada repetição, calcula `resul = i * n`.
6. Exibe a multiplicação e seu resultado.
7. Incrementa `i` até completar a tabuada de 1 a 10.

## 📥 Exemplo de entrada

```text
5
```

## 📤 Exemplo de saída

```text
1 x 5 = 5
2 x 5 = 10
3 x 5 = 15
4 x 5 = 20
5 x 5 = 25
6 x 5 = 30
7 x 5 = 35
8 x 5 = 40
9 x 5 = 45
10 x 5 = 50
```

## 🔎 Explicação do exemplo

Considerando `N = 5`:

| Multiplicador | Operação | Resultado |
|---|---|---|
| 1 | 1 × 5 | 5 |
| 2 | 2 × 5 | 10 |
| 3 | 3 × 5 | 15 |
| 4 | 4 × 5 | 20 |
| 5 | 5 × 5 | 25 |
| 6 | 6 × 5 | 30 |
| 7 | 7 × 5 | 35 |
| 8 | 8 × 5 | 40 |
| 9 | 9 × 5 | 45 |
| 10 | 10 × 5 | 50 |

## 📚 Conceitos praticados

- Entrada de dados utilizando `Scanner`
- Estrutura de repetição `for`
- Inicialização, condição e incremento de um laço
- Operações de multiplicação
- Armazenamento de resultados em variáveis
- Concatenação de Strings
- Saída formatada com `System.out.println()`

## 🎯 Objetivo

Praticar o uso de estruturas de repetição em Java, automatizando cálculos de
