package track.twoPointerPractice;

import java.util.Scanner;
class antiClockwise {
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
        int temp = a[0];
        for(int i = 1;i <= a.length-1;i++){
            a[i-1] = a[i];
            
        }
        a[a.length-1] = temp;
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
23 34 12 */