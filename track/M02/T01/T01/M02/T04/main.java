class student{
    int roll;
    String name;
    double height;
    void run(){
        System.out.println("running");    
    }
    void sleep(){
        System.out.println("sleeping");    
    }
}

public class main{
    public static void main(String[] args){
        student s1 = new student();
        s1.roll= 12;
        s1.name= "raja";
        s1.height= 5.5;
        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.height);
        s1.run();
        s1.sleep();

        student s2 = new student();
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