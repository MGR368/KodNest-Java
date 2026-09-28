package track.strings.string.pgm;

import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = scan.next();
        char charArr[] = str.toCharArray();
        char revArr[] = new char[charArr.length];
        int j = revArr.length - 1;
        for (int i = 0; i < charArr.length; i++) {
            revArr[j] = charArr[i];
            j--;
        }
        String revStr = new String(revArr);
        if (str.equalsIgnoreCase(revStr)) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
        scan.close();

    }

}
