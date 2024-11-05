import java.util.Scanner;

public class ejercicio6 {

    // Método para invertir la cadena
    public static String invertirCadena(String cadena) {
        StringBuilder cadenaInvertida = new StringBuilder(cadena);
        return cadenaInvertida.reverse().toString();
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cadena
        System.out.print("Introduce una cadena de caracteres: ");
        String cadenaUsuario = scanner.nextLine();

        // Llamar al método para invertir la cadena y mostrar el resultado
        String cadenaInvertida = invertirCadena(cadenaUsuario);
        System.out.println("Cadena invertida: " + cadenaInvertida);

        // Cerrar el scanner
        scanner.close();
    }
}
