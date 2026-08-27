package track.Arrays.twodimensionalarrays;

import java.util.Scanner;

public class monthlySales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int products = scanner.nextInt();
        int months = scanner.nextInt();
        int a[][] = new int[products][months];

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < a.length; i++) {
            int total = 0;
            for(int j = 0; j < a[i].length; j++) {
                total = total + a[i][j];
            }
            System.out.println("Product " + (i + 1) + " total: " + total);
        }
        scanner.close();
    }
}