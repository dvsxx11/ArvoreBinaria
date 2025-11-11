public class ArvoreBinaria {
    private Node raiz;

    public void inserir(int valor) {
        raiz = inserirRec(raiz, valor);
    }

    private Node inserirRec(Node atual, int valor) {

        // Caso base: se o nó for nulo, cria um novo
        if (atual == null) {
            return new Node(valor);
        }

        // Chamada recursiva: vai pra esquerda ou direita
        if (valor < atual.valor) {
            atual.esquerda = inserirRec(atual.esquerda, valor);
        } else if (valor > atual.valor) {
            atual.direita = inserirRec(atual.direita, valor);
        }

        return atual;
    }

    public boolean buscar(int valor) {
        return buscarRec(raiz, valor);
    }

    private boolean buscarRec(Node atual, int valor) {
        // Caso base: se o nó for nulo ou achou o valor
        if (atual == null) return false;
        if (atual.valor == valor) return true;

        // Chamada recursiva: busca do lado certo
        if (valor < atual.valor) {
            return buscarRec(atual.esquerda, valor);
        } else {
            return buscarRec(atual.direita, valor);
        }
    }


    public void preOrdem() {
        preOrdemRec(raiz);
    }

    private void preOrdemRec(Node no) {
        if (no != null) {
            System.out.print(no.valor + " ");
            preOrdemRec(no.esquerda);
            preOrdemRec(no.direita);
        }
    }

    public void emOrdem() {
        emOrdemRec(raiz);
    }
    private void emOrdemRec(Node no) {
        if (no != null) {
            emOrdemRec(no.esquerda);
            System.out.print(no.valor + " ");
            emOrdemRec(no.direita);
        }
    }

    public void posOrdem() {
        posOrdemRec(raiz);
    }

    private void posOrdemRec(Node no) {
        if (no != null) {
            posOrdemRec(no.esquerda); // esquerda
            posOrdemRec(no.direita);  // direita
            System.out.print(no.valor + " "); // raiz no final
        }
    }
}
