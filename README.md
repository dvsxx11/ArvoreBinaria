#  Trabalho Prático – Árvores Binárias e Recursividade

**Disciplina:** Estrutura de Dados  
**Professor:** Anderson Soares  

##  Objetivo
Compreender o conceito de recursividade e aplicá-lo na implementação de uma árvore
binária de busca (BST), incluindo as operações de inserção, busca e percursos
(pré-ordem, em ordem e pós-ordem).

---

### 1. O que é recursividade?
Recursividade é quando uma função chama ela mesma pra resolver um problema menor.  
Ela sempre precisa de um **caso base**, que é a condição de parada, pra não entrar em loop infinito.

Exemplo simples:
```java
int fatorial(int n) {
    if (n == 0) return 1; // caso base
    return n * fatorial(n - 1); // chamada recursiva
}
```

### 2. Como a recursividade é usada na percorrência (travessia) de uma árvore binária?
A recursividade é usada pra percorrer os nós da árvore sem precisar usar for ou while. Cada função visita o nó atual e depois chama ela mesma pra ir pros filhos da esquerda e da direita. Dessa forma, a função percorre toda a árvore naturalmente até os nós folhas.

Exemplo simples:
```java
void emOrdem(Node no) {
    if (no != null) {
        emOrdem(no.esquerda);  // chamada recursiva pra esquerda
        System.out.print(no.valor + " "); // mostra o valor atual
        emOrdem(no.direita);   // chamada recursiva pra direita
    }
}
```
### 3. Qual a diferença entre recursão e laço (for/while)?
A recursão usa uma função chamando ela mesma. O laço usa uma condição e repete o código até ela ser falsa. Na recursão, o controle é feito pela pilha de chamadas, e no laço é feito por condições e contadores. Pra árvores, a recursão é mais prática porque cada nó “chama” a função pros seus filhos.

Exemplo simples de recursão e laço:
Com recursão:
```java
void imprimir(int n) {
    if (n <= 5) {
        System.out.println(n);
        imprimir(n + 1); // chamada recursiva
    }
}
```
Com laço:
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```




