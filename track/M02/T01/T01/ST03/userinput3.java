import java.util.Scanner;
public class userinput3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter char : ");  //Ram
        char ch = scanner.next().charAt(2);
        System.out.println(ch);
        scanner.close();
    }
}