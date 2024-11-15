package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] numeros = new int[N];

        for (int i = 0; i < N; i++) {
            numeros[i] = scanner.nextInt();
        }

        if (hayEspacioSuficiente(N)) {
            if (estanOrdenados(numeros)) {
                System.out.println(numeros[0] + " " + N);
            } else {
                for (int num : numeros) {
                    System.out.print(num + " ");
                }
            }
        } else {
            System.out.println("ERROR");
        }
    }

    public static boolean hayEspacioSuficiente(int N) {
        return true;
    }

    public static boolean estanOrdenados(int[] numeros) {
        boolean creciente = true;
        boolean decreciente = true;

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < numeros[i - 1]) {
                creciente = false;
            }
            if (numeros[i] > numeros[i - 1]) {
                decreciente = false;
            }
        }

        return creciente || decreciente;
    }
}
