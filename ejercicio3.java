import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cadena
        System.out.print("Introduce una cadena: ");
        String cadena = scanner.nextLine();

        // Solicitar al usuario que ingrese un carácter
        System.out.print("Introduce un carácter: ");
        String input = scanner.nextLine();

        // Validar que el usuario ha introducido exactamente un carácter
        while (input.length() != 1) {
            System.out.print("Error: Debes introducir exactamente un carácter. Inténtalo de nuevo: ");
            input = scanner.nextLine();
        }

        char caracter = input.charAt(0);
        int contador = 0;

        // Contar cuántas veces aparece el carácter en la cadena
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                contador++;
            }
        }

        // Mostrar el resultado
        System.out.println("El carácter '" + caracter + "' aparece " + contador + " veces en la cadena.");

        // Cerrar el scanner
        scanner.close();
    }
}

