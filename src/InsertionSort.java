import java.util.Arrays;

public class InsertionSort {

    public void sort(int[] numeros, boolean ordenOpt, boolean pasos) {
        int comparaciones = 0, cambios = 0;

        for (int i = 1; i < numeros.length; i++) {
            int temp = numeros[i];
            int j = i - 1;

            // ordenOpt == true → ascendente ; ordenOpt == false → descendente
            while (j >= 0 && (ordenOpt ? numeros[j] > temp : numeros[j] < temp)) {
                numeros[j + 1] = numeros[j];
                j--;
                comparaciones++;

                if (pasos) {
                    System.out.println(Arrays.toString(numeros));
                }
            }

            numeros[j + 1] = temp;
            cambios++;
        }

        System.out.println("Arreglo ordenado: " + Arrays.toString(numeros));
        System.out.println("Comparaciones: " + comparaciones);
        System.out.println("Cambios: " + cambios);
    }
}
