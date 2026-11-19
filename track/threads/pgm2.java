package track.threads;

import java.util.Scanner;

public class pgm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();

        System.out.println("enter 1st nnumber: ");
        int n1 = sc.nextInt();
        System.out.println("enter 2nd nnumber: ");
        int n2 = sc.nextInt();
        int res = n1 + n2;
        System.out.println("Addition  result is: " + res);

    }

}
