import java.util.Scanner;

public class userinput2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = scanner.nextInt();
        System.out.println("Age is  "+age);

        System.out.println("Enter your height : ");
        double height = scanner.nextDouble();
        System.out.println("Height is  "+height);
        scanner.nextLine();

        System.out.println("Enter your name : ");
        String fname = scanner.nextLine();
        System.out.println("Name is  "+fname);

        scanner.close();
    }
}