package ejercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        int left = 1;
        int right = K;
        int maxDuration = 0;

        while (left <= right) {
            int mid = (left + right) / 2;

            int totalMinutes = mid * N + (N - 1);

            if (totalMinutes <= K) {
                maxDuration = mid;
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }

        System.out.println(maxDuration);
    }
}
