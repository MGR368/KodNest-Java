package track.Arrays.arrayProblemSolving;

import java.util.Scanner;

public class searchGivenValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input and complete the array logic.
        int n = scanner.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();
        int found = -1;

        for(int i = 0; i < a.length; i++) {
            if(a[i] == target) {
                found = i;
                break;
            }
        }

        System.out.println(found);

        scanner.close();
    }
}