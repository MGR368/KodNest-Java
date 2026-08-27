package track.Arrays.arrayProblemSolving;

import java.util.Scanner;

public class sumAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input and complete the array logic.
        int size = scanner.nextInt();
        
        long total = 0;
        for (int i = 0; i < size; i++) {
            total += scanner.nextInt();
        }

        System.out.println(total);

        double average = (double) total / size;
        System.out.printf("%.2f%n",average);

        scanner.close();
    }
}