
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese una cadena
        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();
        
        // Solicitar al usuario que ingrese la subcadena
        System.out.print("Introduce una subcadena: ");
        String subcadena = scanner.nextLine();
        
        // Comprobar si la cadena comienza con la subcadena
        if (cadena.startsWith(subcadena)) {
            System.out.println("La cadena comienza con la subcadena.");
        } else {
            System.out.println("La cadena NO comienza con la subcadena.");
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}
