package track.ExceptionHandling;

import java.util.*;

public class pgm1 {
    public static void main(String[] args) {
        System.out.println("Connection established");
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a : ");
            int a = scan.nextInt();
            System.out.println("Enter b : ");
            int b = scan.nextInt();
            int res = a / b;
            System.out.println("Result : " + res);
        } catch (ArithmeticException e) {
            System.out.println("canot divide by ZERO");
        }
        System.out.println("Connection terminated");
    }
}