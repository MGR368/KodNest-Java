package track.strings.string.pgm;

import java.util.*;

public class anagram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string1 and string2: ");
        String s1 = scan.next();
        String s2 = scan.next();

        if (s1.length() != s2.length()) {
            System.out.println("not anagrams");
            return;
        }

        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String sortedStr1 = new String(arr1);
        String sortedStr2 = new String(arr2);

        if (sortedStr1.equalsIgnoreCase(sortedStr2)) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings are not anagrams");
        }
        scan.close();

    }

}
