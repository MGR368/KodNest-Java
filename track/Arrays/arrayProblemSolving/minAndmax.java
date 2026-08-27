package track.Arrays.arrayProblemSolving;

import java.util.Scanner;

public class minAndmax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int min = scanner.nextInt();
        int max = min;

        for (int i = 1; i < n; i++) {
            int val = scanner.nextInt();
            if (val < min) {
                min = val;
            }
            if (val > max) {
                max = val;
            }
        }

        System.out.println(min + " " + max);

        scanner.close();
    }
}
