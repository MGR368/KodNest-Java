package track.Arrays.arrayProblemSolving;

import java.util.Scanner;

public class countEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < size; i++) {
            if (scanner.nextInt() % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println(evenCount + " " + oddCount);

        scanner.close();
    }
}
