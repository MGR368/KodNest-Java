package track.Arrays.arrayProblemSolving;

import java.util.Scanner;

public class twoArraysIdentical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int[] a = new int[m];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < b.length; i++) {
            b[i] = scanner.nextInt();
        }

        int isIdentical = 1;
        if (m != n){
            isIdentical = 0;
        }else if (m == n) {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    isIdentical = 0;
                    break;
                }
            }
        }
        System.out.println(isIdentical);
        scanner.close();
    }
}
