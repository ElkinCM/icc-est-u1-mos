import Controllers.ShellSort;

public class App {
    public static void main(String[] args) throws Exception {
        int[] a = {-10, 0, 4, 7, 2, 1, 9, 6};
        ShellSort shellSort = new ShellSort();

        System.out.println("Orden Ascendente:");
        shellSort.sort(a, true); // Ordenar de manera ascendente
        System.out.println("Array ordenado (Ascendente):");
        shellSort.imprimir(a);

        System.out.println("\nOrden Descendente:");
        shellSort.sort(a, false); // Ordenar de manera descendente
        System.out.println("Array ordenado (Descendente):");
        shellSort.imprimir(a);
    }
}