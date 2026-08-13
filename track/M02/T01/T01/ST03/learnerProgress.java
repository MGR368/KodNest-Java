import java.util.Scanner;

public class learnerProgress {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the learner details
        // Calculate and display the progress summary

        String fullName = scan.nextLine();

        int days = scan.nextInt();

        int totalSolved = 0;
        for (int i = 0; i < days; i++) {
            totalSolved += scan.nextInt();
        }

        double dailyAverage = (double) totalSolved / days;
        String status = (dailyAverage >= 5.0) ? "Consistent" : "Needs consistency";

        System.out.println("Learner: " + fullName);
        System.out.println("Total solved: " + totalSolved);
        System.out.println("Daily average: " + dailyAverage);
        System.out.println("Status: " + status);

        scan.close();
    }
}