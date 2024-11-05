import java.util.Scanner;

public class ejercicio7{

    // Método para reemplazar el primer carácter por el segundo
    public static String ejercicio7 (String cadena, char caracterOriginal, char caracterNuevo) {
        // Usamos el método replace() para reemplazar todas las apariciones del carácter original
        return cadena.replace(caracterOriginal, caracterNuevo);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cadena al usuario
        System.out.print("Introduce una cadena de caracteres: ");
        String cadena = scanner.nextLine();

        // Solicitar el primer carácter y validar que sea un solo carácter
        char caracterOriginal = '\0';
        while (true) {
            System.out.print("Introduce el primer carácter (a reemplazar): ");
            String input = scanner.nextLine();
            if (input.length() == 1) {
                
