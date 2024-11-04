import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese una cadena
        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();
        
        // Imprimir cada carácter de la cadena
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}
