public class App {
    public static void main(String[] args) throws Exception {
        View view = new View();
        //view.showMenu();
        //view.inputOption(4);

        int[] numeros = new int[] {1, 3 ,4, 5, 2};
        SortSelection sortSelection = new SortSelection();
        InsertionSort sortInsertion = new InsertionSort();

        while (true) {
            view.showMenu();
            int option = view.inputOption(4); 

            view.showOrder();
            int orden = view.inputOption(2);
            boolean ordenOpt = orden == 1;
            view.showPasosMenu();
            int pasos = view.inputOption(2);
            
            switch (option) {
                case 1:
                    System.out.println("Metodo Seleccion");
                    sortSelection.sort(numeros, ordenOpt, pasos == 1);
                    break;
                case 2:
                    System.out.println("Metodo Insercion");
                    sortInsertion.sort(numeros, ordenOpt, pasos == 1);
                    break;
                case 3:
                    System.out.println("Metodo Burbuja");

                    break;
                case 4:
                    System.out.println("Adios");
                    System.exit(0);
                    break;            
                default:
                    break;
            }
        }
    }
}
