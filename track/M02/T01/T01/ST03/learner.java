import java.util.Scanner;

public class learner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read and display the profile
        String name = scanner.next();
        int problems = scanner.nextInt();
        double percentage = scanner.nextDouble();

        System.out.println("Learner: " + name);
        System.out.println("Problems solved: " + problems);
        System.out.println("Assessment: " + percentage );

        scanner.close();
    }
}