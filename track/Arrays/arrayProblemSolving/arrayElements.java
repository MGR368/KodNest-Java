package track.Arrays.arrayProblemSolving;

import java.util.Scanner;

public class arrayElements{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input and complete the array logic.
        int size = scanner.nextInt();
        int[] a = new int[size];

        for(int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        for(int i = 0; i < a.length; i++) {
            if(i > 0) {
                System.out.print(" ");
            }
            System.out.print(a[i]);
        }

        scanner.close();
    }
}