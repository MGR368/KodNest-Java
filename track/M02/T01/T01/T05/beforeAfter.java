import java.util.Scanner;

class Learner {
    int id;
    String name;
    int javaScore;
}

public class beforeAfter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read first learner details
        Learner l1 = new Learner();
        l1.id = scanner.nextInt();
        l1.name = scanner.next();
        l1.javaScore = scanner.nextInt();

        // Read second learner details
        Learner l2 = new Learner();
        l2.id = scanner.nextInt();
        l2.name = scanner.next();
        l2.javaScore = scanner.nextInt();

        // Read the new score
        int newScore = scanner.nextInt();

        // Display both records before the update
        System.out.println("Before Update");
        System.out.println(l1.id + " - " + l1.name + " - " + l1.javaScore);
        System.out.println(l2.id + " - " + l2.name + " - " + l2.javaScore);

        // Update only the first object
        l1.javaScore = newScore;

        // Display both records after the update
        System.out.println("After Update");
        System.out.println(l1.id + " - " + l1.name + " - " + l1.javaScore);
        System.out.println(l2.id + " - " + l2.name + " - " + l2.javaScore);

        scanner.close();
    }
}
