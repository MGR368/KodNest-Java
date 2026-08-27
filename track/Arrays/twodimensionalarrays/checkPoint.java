package track.Arrays.twodimensionalarrays;

import java.util.Scanner;

public class checkPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] a = new int[size];

        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }

        int row = scanner.nextInt();
        int col = scanner.nextInt();
        int arr[][] = new int[row][col];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int arrayTotal = 0;
        for (int s = 0; s < a.length; s++) {
            arrayTotal = arrayTotal + a[s];
        }

        System.out.println("Array total: " + arrayTotal);

        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                total = arr[i][j] + total;
            }
        }

        System.out.println("Matrix total: " + total);

        scanner.close();
    }
}
