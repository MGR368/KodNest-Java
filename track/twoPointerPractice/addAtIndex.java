package track.twoPointerPractice;

import java.util.Scanner;
class addAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int element = sc.nextInt();
        int index = sc.nextInt();
        int[] b = new int[a.length + 1];
        for(int i =0;i < index;i++){
            b[i] = a[i];
        }
        b[index] = element;
        for(int i = index ; i < a.length;i++){
            b[i+1] = a[i];
        }
        for(int i : b){
            System.out.print(i + " ");
        }
        sc.close();
    }    
}
/*5
12 23 34 45 56
90
2
12 23 90 34 45 56 */