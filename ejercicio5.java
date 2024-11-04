import java.util.Scanner;

public class ejercicio5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un nombre y apellidos
        System.out.print("Introduce tu nombre y apellidos: ");
        String nombreCompleto = scanner.nextLine();

        // Dividir la cadena en palabras
        String[] partes = nombreCompleto.trim().split("\\s+");

        // Inicializar un StringBuilder para almacenar las iniciales
        StringBuilder iniciales = new StringBuilder();

        // Obtener las iniciales
        for (String parte : partes) {
            if (!parte.isEmpty()) {
                iniciales.append(Character.toUpperCase(parte.charAt(0))); // Agregar la inicial en mayúscula
            }
        }

        // Mostrar las iniciales
        System.out.println("Las iniciales son: " + iniciales.toString());

        // Cerrar el scanner
        scanner.close();
    }
}
