package track.constructors;

class Student {
    String name;
    int age;
    double height;

    Student(){
        name = "Anu";
        age = 19;
        height = 5.0;
    }
    Student(String name){
        this.name = name;
    }

    Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

public class version3 {
    public static void main(String[] args) {
        Student s1 = new Student("Raja", 20, 5.5);
        s1.display();
        Student s2 = new Student("Manu");
        s2.display();
        Student s3 = new Student();
        s3.display();
        
    }
}
