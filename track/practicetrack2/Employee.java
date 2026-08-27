package track.practicetrack2;
import java.util.Scanner;

public class Employee {
    String empId;
    String empName;
    String empEmail;
    double empSalary;

    Scanner sc = null;

    public Employee(String empId, String empName, String empEmail, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empEmail = empEmail;
        this.empSalary = empSalary;

    }

    public String getEmpData() {
        return "Employee ID: " + empId
                + "\nEmployee Name: " + empName
                + "\nEmployee Email: " + empEmail
                + "\nEmployee Salary : " + empSalary;
    }
    void updateName(String empName){
        this.empName = empName;
    }
    /*void loadScanner(Scanner sc){
        this.sc = sc;
    }
    void searchId(String empId, Employee emp[]){
        for(Employee e : emp){
            if(e.empId.equals(empId)){
                System.out.println("Employee Found Enter name to update: ");
            }
        }
    }*/
}
