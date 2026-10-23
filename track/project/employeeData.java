package track.project;

abstract class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        employeeCount++; // increment count on every object creation
    }

    static String companyName = "KodNest";
    static int employeeCount = 0;

    static void showRole() {
        System.out.println("Employee Role");
    }

    abstract void calculateSalary();

    void displayDetails() {
    }
}

class Developer extends Employee {
    double bonus = 5000;

    Developer(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    void calculateSalary() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Role: Developer");
        System.out.println("Salary: " + (salary + bonus));
    }

    static void showRole() {
        System.out.println("Developer Role");
    }

}

class Trainer extends Employee {
    double allowance = 3000;

    Trainer(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    void calculateSalary() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Role: Trainer");
        System.out.println("Salary: " + (salary + allowance));
    }

    static void showRole() {
        System.out.println("Trainer Role");
    }
}

public class employeeData {
    public static void main(String[] args) {
        System.out.println("Company: " + Employee.companyName);
        Employee e1 = new Developer(101, "Rahul", 40000);
        Employee e2 = new Trainer(102, "Priya", 35000);

        e1.calculateSalary();
        e1.displayDetails();

        e2.calculateSalary();
        e2.displayDetails();

        System.out.println("Total Employees: " + Employee.employeeCount);
        System.out.println("Employee Role");
        e1.showRole();
        e2.showRole();

    }

}
