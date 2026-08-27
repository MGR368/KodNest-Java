package track.Arrays.oneDimensionalArrays;

import java.util.Scanner;

class Search{
    void searchTarget(int arr[],int target){
        boolean found = false;
        for(int i =0;i<= arr.length-1;i++){
            if(arr[i] == target){
                System.out.println("Found");
                found = true ;
                break;
            }
        }
        if (!found){
            System.out.println("Not Found");
        }
    }
    void reverse(int arr[]){
        System.out.print("Reverse order: " );
        for(int i = arr.length-1;i >= 0;i--){
            System.out.print(arr[i] + " ");
        }
    }
}

public class searchReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for(int i=0; i<size; i++) {
            arr[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();

        Search s = new Search();
        s.searchTarget(arr, target);
        s.reverse(arr);

        scanner.close();
    }
}