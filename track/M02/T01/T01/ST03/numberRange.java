
import java.util.Scanner;

public class numberRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the range and analyze its numbers
        int startvalue = scanner.nextInt();
        int endvalue = scanner.nextInt();

        int evensum = 0;
        int oddcount = 0;

        for (int i = startvalue; i <= endvalue; i++) {
            if (i % 2 == 0) {
                evensum += i;
            } else {
                oddcount++;
            }
        }

        System.out.println("Even sum: " + evensum);
        System.out.println("Odd count: " + oddcount);

        scanner.close();
    }
}
