import java.util.Arrays;

public class BubbleSort {

    public void sort(int[] numeros, boolean ordenOpt, boolean pasos) {
        int comparaciones = 0, cambios = 0;
        int n = numeros.length;

        for (int i = 0; i < n - 1; i++) {
            boolean huboCambio = false;

            for (int j = 0; j < n - 1 - i; j++) {
                comparaciones++;

                boolean condicion = ordenOpt ? numeros[j] > numeros[j + 1]
                                             : numeros[j] < numeros[j + 1];

                if (condicion) {
                    int tmp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = tmp;
                    cambios++;
                    huboCambio = true;

                    if (pasos) {
                        System.out.println(Arrays.toString(numeros));
                    }
                }
            }

            if (!huboCambio) break;
        }

        System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Cambios: " + cambios);
    }
}
