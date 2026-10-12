package track.oops.polymorphism;

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

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    void display() {
        System.out.println(roll);
        System.out.println(name);
    }
}

public class studentApp2 {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Manigeethika");
        Student s2 = new Student(102, "Divyansh");
        Student s3 = new Student(101, "Manigeethika");

        s1.display();
        s2.display();
        s3.display();

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
