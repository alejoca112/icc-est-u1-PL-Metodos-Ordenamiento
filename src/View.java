import java.util.Scanner;

public class View {
    
    //Variable Global Privada para el Scanner
    private final Scanner scanner;         // Como no cambia de valor se coloca final

    public View(){
        System.out.println("Metodos Ordenamiento: ");
        scanner = new Scanner(System.in);

    }

    public void showMenu() {
        System.out.println("/n --Menu metodos--");
        System.out.println("1-> Selection");
        System.out.println("2-> Insertion");
        System.out.println("3-> Bubble");
        System.out.println("4-> Salir");
        System.err.print("Seleccione la opcion: ");
        
    }

    public int inputOption(int max) {
        int option = -1;   //Es mejor para no tener opcion o un valor invalido
        while (true) {
            if (scanner.hasNextInt()) {
                //Si ingreso un numero
                option = scanner.nextInt();
                if (option >= 1 && option <= max) 
                    break;   //Salir del ciclo
            } else {
                scanner.next();
            }
            System.out.print("Opcion Invalida, ingrese otra vez: ");

        }

        return option;
    }

    public void showOrder(){
        System.out.println("-Seleccione el orden-");
        System.out.println("1-> Asc");
        System.out.println("2-> Desc");
        System.err.print("Seleccione la opcion: ");

    }

    public void showPasosMenu() {
        System.out.println("-Quiere ver los pasos-");
        System.out.println("1-> Si");
        System.out.println("2-> No");
        System.err.print("Seleccione la opcion: ");
    }


    



}
