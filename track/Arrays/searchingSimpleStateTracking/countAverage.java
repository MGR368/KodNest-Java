package track.Arrays.searchingSimpleStateTracking;

import java.util.Scanner;

public class countAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] arr = new int[n];
        long sum = 0;
        
        for (int i = 0 ; i < n ; i++) {
            arr[i] = scanner.nextInt();
            sum = sum + arr[i];
        }
        
        double average = (double) sum / n;
        int count = 0;
        
        for (int i : arr) {
            if (i > average) {
                count++;
            }
        }
        
        System.out.println(count);
        scanner.close();
        
    }
}