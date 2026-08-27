package track.Arrays.twodimensionalarrays;

import java.util.Scanner;

public class seatAnalyzer {
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

        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] == 0) {
                    count++;
                }
            }
        }

        System.out.println("Available seats: " + count);
        scanner.close();
    }
}
