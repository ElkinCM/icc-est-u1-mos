package Controllers;

public class ShellSort {
    public void sort(int[] array, boolean ascending) {
        int n = array.length;
        int cambio = 0;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            System.out.println("Cambio: " + (cambio + 1) + " Gap: " + gap);
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j = i;
                while (j >= gap && (ascending ? array[j - gap] > temp : array[j - gap] < temp)) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = temp;
            }
            imprimir(array);
            cambio++;
        }
    }

    public void imprimir(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}