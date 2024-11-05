import java.util.Scanner;

public class ejercicio10 {
    // Método para verificar si la cadena es un palíndromo
    public static boolean esPalindromo(String cadena) {
        // Eliminar espacios y convertir a minúsculas
        cadena = cadena.replaceAll("\\s", "").toLowerCase();

        // Crear una cadena invertida
        StringBuilder cadenaInvertida = new StringBuilder(cadena);
        cadenaInvertida.reverse();

        // Comparar la cadena o
