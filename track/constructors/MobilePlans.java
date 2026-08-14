package track.constructors;

import java.util.Scanner;

class MobilePlan {
    String planName;
    int price;

    MobilePlan() {
        // Set Basic and 199
        this.planName = "Basic";
        this.price = 199;
    }

    MobilePlan(String planName, int price) {
        // Store both received values
        this.planName = planName;
        this.price = price;
    }

    void display() {
        System.out.println("Plan: " + planName + ", Price: " + price);
    }
}

public class MobilePlans{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the selected plan name and price
        String planName = scanner.nextLine();
        int price = scanner.nextInt();

        MobilePlan defaultPlan = new MobilePlan();
        MobilePlan selectedPlan = new MobilePlan(planName, price);

        defaultPlan.display();
        selectedPlan.display();

        scanner.close();
    }
}
