package track.Arrays.twodimensionalarrays;

import java.util.Scanner;

public class readDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int arr[][] = new int[m][n];
        for(int i=0;i<= arr.length-1;i++){
            for(int j=0;j<= arr[i].length-1;j++){
                arr[i][j] = scanner.nextInt();
            }
        }
        for(int i=0;i<= arr.length-1;i++){
            for(int j=0;j<= arr[i].length-1;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println( );
        }
        scanner.close();
    }
}
