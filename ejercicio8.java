import java.util.Scanner;

public class ejercicio8 {

    // Método para convertir mayúsculas a minúsculas y viceversa
    public static String ejercicio8 (String cadena) {
        StringBuilder resultado = new StringBuilder();

        // Iterar sobre cada carácter de la cadena
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            // Si el carácter es una mayúscula, lo convertimos a minúscula
            if (Character.isUpperCase(c)) {
                resultado.append(Character.toLowerCase(c));
            }
            // Si el carácter es una minúscula, lo convertimos a mayúscula
            else if (Character.isLowerCase(c)) {
                resultado.append(Character.toUpperCase(c));
            } else {
                // Si no es una letra, lo dejamos igual
                resultado.append(c);
            }
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una cadena
        System.out.print("Introduce una cadena de caracteres: ");
        String cadena = scanner.nextLine();

        // Llamar al método para convertir las mayús
