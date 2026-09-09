package track.twoPointerPractice;

import java.util.Scanner;
class clockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i =0;i<n;i++){
            a[i] = sc.nextInt();
        }
        //int element = sc.nextInt();
        //int index = sc.nextInt();
        //int[] b = new int[a.length];
        int temp = a[n-1];
        for(int i = a.length-2;i >= 0;i--){
            a[i+1] = a[i];
            
        }
        a[0] = temp;
        /*for(int i = index+1 ; i < a.length;i++){
            b[i-1] = a[i];
        }*/
        for(int i : a){
            System.out.print(i + " ");
        }
        sc.close();
    }    
}

/*3
12 23 34
34 12 23  */