package Ejercicio5;

import java.util.Scanner;

public class Main {

    public static int[][] rotate90AntiClockwise(int[][] matrix, int n) {
        int[][] rotated = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rotated[n - j - 1][i] = matrix[i][j];
            }
        }
        return rotated;
    }

    public static boolean areMatricesEqual(int[][] matrix1, int[][] matrix2, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] original = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                original[i][j] = sc.nextInt();
            }
        }

        int[][] rotatedMatrix = original;

        for (int rotations = 1; rotations <= 4; rotations++) {
            rotatedMatrix = rotate90AntiClockwise(rotatedMatrix, n);
            if (areMatricesEqual(rotatedMatrix, original, n)) {
                System.out.println(rotations % 4);
                return;
            }
        }
    }
}