package track.oops.inheritance;

class animal {
    void eat() {
        System.out.println("animal eats");
    }

    void sleep(){
        System.out.println("animal sleeps");
    }
}

class monkey extends animal {
    @Override
    void eat() {
        System.out.println("monkey steals and eats");
    }
}

class tiger extends animal {
    @Override
    void eat() {
        System.out.println("tiger kills and eats");
    }
}

public class animalApp {
    public static void main(String[] args) {

        monkey m = new monkey();
        m.eat();
        m.sleep();
        tiger t = new tiger();
        t.eat();
        t.sleep();
    }

}
