import java.util.Scanner;

public class userinput2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age = scan.nextInt();
        System.out.println("Age is  "+age);

        System.out.println("Enter your height : ");
        double height = scan.nextDouble();
        System.out.println("Height is  "+height);
        scan.nextLine();

        System.out.println("Enter your name : ");
        String fname = scan.nextLine();
        System.out.println("Name is  "+fname);

        
    }
}