package ejer2;
import java.util.Scanner;

public class ContadorPalabras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una lista de palabras separadas por espacios: ");
        String entrada = scanner.nextLine(); 
        System.out.println("Ingrese la letra inicial para contar las palabras: ");
        char letra = scanner.nextLine().toLowerCase().charAt(0);
        int resultado = contarPalabrasConLetra(entrada, letra);
        System.out.println("Cantidad de palabras que comienzan con " + letra + ": " + resultado);
    }

    public static int contarPalabrasConLetra(String entrada, char letra) {
        String[] palabras = entrada.split(" ");
        int contador = 0;

        for (String palabra : palabras) { 
            if (!palabra.isEmpty() && palabra.toLowerCase().charAt(0) == letra) {
                contador++;
            }
        }

        return contador;
    }
}