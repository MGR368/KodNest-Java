package track.Arrays.twodimensionalarrays;

import java.util.Scanner;

public class matrixTotal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int a[][] = new int[rows][cols];

        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[i].length - 1; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i <= a.length - 1; i++) {
            int total = 0;
            for (int j = 0; j <= a[i].length - 1; j++) {
                total = total + a[i][j];
            }
            System.out.println("Row " + (i + 1) + " total: " + total);
        }
        scanner.close();
    }
}
