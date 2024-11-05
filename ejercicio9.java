import java.util.Scanner;
public class ejercicio9 {
   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la cadena principal
        System.out.print("Introduce la cadena principal: ");
        String cadenaPrincipal = scanner.nextLine();

        // Solicitar al usuario que ingrese la subcadena a buscar
        System.out.print("Introduce la subcadena a buscar: ");
        String subcadena = scanner.nextLine();

        // Comprobar si la cadena principal contiene la subcadena
        if (cadenaPrincipal.contains(subcadena)) {
            System.out.println("La cadena principal contiene la subcadena.");
        } else {
            System.out.println("La cadena principal NO contiene la subcadena.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}

}
