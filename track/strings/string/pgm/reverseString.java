package track.strings.string.pgm;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char arr[] = str.toCharArray();
        char newArr[] = new char[arr.length];
        int j = newArr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            newArr[j] = arr[i];
            j--;
        }

        String revStr = new String(newArr);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + revStr);
        scan.close();

    }
}
