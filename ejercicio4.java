import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una frase
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        // Dividir la frase en palabras usando el espacio como delimitador
        String[] palabras = frase.trim().split("\\s+");

        // Contar las palabras
        int cantidadPalabras = palabras.length;

        // Mostrar el resultado
        System.out.println("La frase contiene " + cantidadPalabras + " palabra(s).");

        // Cerrar el scanner
        scanner.close();
    }
}
