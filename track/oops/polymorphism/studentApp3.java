package track.oops.polymorphism;

import java.util.Objects;

class Student {
    int roll;
    String name;

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        if (this.roll == s.roll && this.name.equals(s.name)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(roll, name);
    }

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    @Override
    public String toString() {
        return "" + roll + " " + name;
    }

    void display() {
        System.out.println(roll);
        System.out.println(name);
    }
}

public class studentApp3 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Manigeethika");
        Student s2 = new Student(102, "Divyansh");
        Student s3 = new Student(101, "Manigeethika");

        Object s4 = new Student(103, "geethika");

        System.out.println(s1.getClass());
        System.out.println(s4.getClass());

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
