import java.util.Scanner;

public class personalTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read income and expenses
        double monthlyincome = scanner.nextDouble();
        double rentexpense = scanner.nextDouble();
        double foodexpense = scanner.nextDouble();
        double travelexpense = scanner.nextDouble();

        double totalexpense = rentexpense + foodexpense + travelexpense;
        // Calculate and display the budget details

        double remainingamount = monthlyincome - totalexpense;

        String budgetstatus;
        if (remainingamount >= 0) {
            budgetstatus = "Within budget";
        } else {
            budgetstatus = "Over budget";
        }

        System.out.println("Total expense: " + totalexpense);
        System.out.println("Remaining: " + remainingamount);
        System.out.println("Status: " + budgetstatus);

        scanner.close();
    }
}