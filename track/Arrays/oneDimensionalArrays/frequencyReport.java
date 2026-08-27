package track.Arrays.oneDimensionalArrays;

import java.util.Scanner;

class Report {
    void count(int ref[], int target) {
        int count = 0;
        for (int i = 0; i < ref.length; i++) {
            if (ref[i] == target) {
                count++;
            }
        }
        System.out.println("Frequency of " + target + ": " + count);
    }
}

public class frequencyReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();

        Report r = new Report();
        r.count(arr, target);
        scanner.close();
    }
}
