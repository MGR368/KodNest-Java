package track.Arrays.arrayProblemSolving;

import java.util.Scanner;

public class diffBtwMinandMax {
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

        int diff = max - min;
        System.out.println(diff);

        scanner.close();
    }
}
