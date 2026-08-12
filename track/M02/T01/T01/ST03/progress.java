import java.util.Scanner;

public class progress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of days
        int days = scanner.nextInt();

        // Calculate the total and display the progress status
        int totalSolved = 0;
        for (int i = 0; i < days; i++) {
            totalSolved += scanner.nextInt();
        }

        String status;
        if (totalSolved >= 20) {
            status = "Strong progress";
        } else if (totalSolved >= 10) {
            status = "Keep improving";
        } else {
            status = "Needs more practice";
        }

        System.out.println("Total solved: " + totalSolved);
        System.out.println("Status: " + status);

        scanner.close();
    }
}