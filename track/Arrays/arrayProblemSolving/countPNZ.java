package track.Arrays.arrayProblemSolving;

import java.util.Scanner;

public class countPNZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input and complete the array logic.
        int n = scanner.nextInt();

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            if (val > 0) {
                positive++;
            } else if (val < 0) {
                negative++;
            } else {
                zero++;
            }
        }

        System.out.println(positive + " " + negative + " " + zero);

        scanner.close();
    }
}
