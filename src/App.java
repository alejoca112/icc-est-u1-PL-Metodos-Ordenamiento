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

            
            switch (option) {
                case 1:
                    System.out.println("Metodo Seleccion");
                    view.showOrder();
                    int orden = view.inputOption(2);
                    boolean ordenOpt = orden == 1;
                    view.showPasosMenu();
                    int pasos = view.inputOption(2);
                    sortSelection.sort(numeros, ordenOpt, pasos == 1);
                    break;
                case 2:
                    System.out.println("Metodo Insercion");
                    view.showOrder();
                    int orden1 = view.inputOption(2);
                    boolean ordenOpt1 = orden1 == 1;
                    view.showPasosMenu();
                    int pasos1 = view.inputOption(2);
                    sortInsertion.sort(numeros, ordenOpt1, pasos1 == 1);
                    break;
                case 3:
                    System.out.println("Metodo Burbuja");
                    //view.showOrder();
                    //int orden2 = view.inputOption(2);
                    //boolean ordenOpt2 = orden2 == 1;
                    //view.showPasosMenu();
                    //int pasos2 = view.inputOption(2);
                    //sortBubble.sort(numeros, ordenOpt2, pasos2 == 1);
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
