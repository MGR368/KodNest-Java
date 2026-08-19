package track.Arrays.oneDimensionalArrays;

import java.util.Scanner;

public class analyzeRuntime {
    public static void main(String[] args) {
        // Write your code here.
        Scanner scanner = new Scanner(System.in);

        int[] readings = new int[5];
        for (int i = 0; i <= readings.length - 1; i++) {
            readings[i] = scanner.nextInt();
        }

        int total = 0;
        for (int i = 0; i <= readings.length - 1; i++) {
            total = total + readings[i];
        }

        System.out.println("Total: " + total);
        scanner.close();
    }
}
