public class SortSelection {
    
    public SortSelection() {
        }
    public void SortAscendente(int[] numeros) {

            for(int i = 0; i < numeros.length; i++) {
                int i_menor = i;
                for(int j = i+1; j < numeros.length ; j++){
                    if (numeros[j] < numeros[i_menor]) {
                        i_menor = j;
                    }

            }
            if (i != i_menor) {
                int temp = numeros[i];
                numeros[i] = numeros[i_menor];
                numeros[i_menor] = temp; 
            }

        }

    }
    
    public void SortDescendente(int[] numeros) {
        for(int i = 0; i < numeros.length; i++) {
                int i_menor = i;
                for(int j = i+1; j < numeros.length ; j++){
                    if (numeros[j] < numeros[i_menor]) {
                        i_menor = j;
                    }

            }
            if (i != i_menor) {
                int temp = numeros[i];
                numeros[i] = numeros[i_menor];
                numeros[i_menor] = temp; 
            }

        }
    }

    public  void printArray(int[] numeros) {
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {

            if (i == numeros.length - 1) {
                System.out.println(numeros[i]);
            } else {
                System.out.print(numeros[i]+ ", ");
            }
            
            
        }
        System.out.println("]");
    }

}