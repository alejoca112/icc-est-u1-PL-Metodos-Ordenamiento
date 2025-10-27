import java.util.Arrays;

public class SortSelection {

    public void sort(int[] numeros, boolean ordenOpt, boolean pasos) {
        int comparaciones = 0, cambios = 0;

        for (int i = 0; i < numeros.length - 1; i++) {
            int pos = i;

            for (int j = i + 1; j < numeros.length; j++) {
                comparaciones++;
                // ordenOpt == true → ascendente ; ordenOpt == false → descendente
                if (ordenOpt ? numeros[j] < numeros[pos] : numeros[j] > numeros[pos]) {
                    pos = j;
                }
            }

            if (pos != i) {
                int temp = numeros[i];
                numeros[i] = numeros[pos];
                numeros[pos] = temp;
                cambios++;

                if (pasos) {
                    System.out.println(Arrays.toString(numeros));
                }
            }
        }

        System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Cambios: " + cambios);
    }
}
