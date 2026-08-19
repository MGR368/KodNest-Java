package track.Arrays.oneDimensionalArrays;

import java.util.Scanner;

public class arrayStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] a = new int[size];

        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = scanner.nextInt();
        }

        int minimum = a[0];
        int maximum = a[0];

        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] < minimum) {
                minimum = a[i];
            }
        }
        System.out.println("Minimum: " + minimum);

        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] > maximum) {
                maximum = a[i];
            }
        }
        System.out.println("Maximum: " + maximum);
        scanner.close();
    }

}
