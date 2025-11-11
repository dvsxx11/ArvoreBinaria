public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        int[] valores = {8, 3, 10, 1, 6, 14, 4, 7, 13};

        System.out.print("Inserindo: ");
        for (int v : valores) {
            System.out.print(v + " ");
            arvore.inserir(v);
        }

        System.out.println("\n\nPré-ordem:");
        arvore.preOrdem();

        System.out.println("\nEm ordem:");
        arvore.emOrdem();

        System.out.println("\nPós-ordem:");
        arvore.posOrdem();

        System.out.println("\n\nBuscar 7 → " + (arvore.buscar(7) ? "Encontrado" : "Não encontrado"));
        System.out.println("Buscar 2 → " + (arvore.buscar(2) ? "Encontrado" : "Não encontrado"));
    }
}
