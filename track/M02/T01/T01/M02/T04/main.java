class StudentData {
    int roll;
    String name;
    double height;

    void run() {
        System.out.println("running");
    }

    void sleep() {
        System.out.println("sleeping");
    }
}

public class Main {
    public static void main(String[] args) {
        StudentData s1 = new StudentData();
        s1.roll = 12;
        s1.name = "raja";
        s1.height = 5.5;
        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.height);
        s1.run();
        s1.sleep();

        StudentData s2 = new StudentData();
        s2.roll = 11;
        s2.name = "ram";
        s2.height = 5.6;
        System.out.println(s2.roll);
        System.out.println(s2.name);
        System.out.println(s2.height);
        s2.run();
        s2.sleep();
    }
}
