package track.constructors;

import java.util.Scanner;

class FoodOrder {
    String item;
    int quantity;

    FoodOrder(String item) {
        // Store the item and set quantity to 1
        this.item = item;
        this.quantity = 1;
    }

    FoodOrder(String item, int quantity) {
        // Store both values
        this.item = item;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("Order: " + item + ", Quantity: " + quantity);
    }
}

public class FoodOrders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the item and quantity
        String item = scanner.nextLine();
        int quantity = scanner.nextInt();

        FoodOrder singleOrder = new FoodOrder(item);
        FoodOrder groupOrder = new FoodOrder(item, quantity);

        singleOrder.display();
        groupOrder.display();

        scanner.close();
    }
}
