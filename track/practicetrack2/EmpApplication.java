package track.practicetrack2;

import java.util.Scanner;

public class EmpApplication {
    public static void main(String[] args) {
        Employee empArray[] = new Employee[2];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < empArray.length ; i++){
        System.out.println("Enter employee details: " + (i + 1));
        System.out.println("Enter Employee ID : ");
        String  empId = scanner.next();
        scanner.nextLine();

        System.out.println("Enter Employee Name : ");
        String empName = scanner.nextLine();

        System.out.println("Enter Employee Email : ");
        String empEmail = scanner.nextLine();
        
        System.out.println("Enter Employee Salary : ");
        double empSalary = scanner.nextDouble();
        
        Employee e = new Employee(empId, empName, empEmail, empSalary);

        empArray[i] = e;
        }
        for(Employee emp : empArray){
            System.out.println(emp.getEmpData());
        }
        scanner.close();

    }

}
