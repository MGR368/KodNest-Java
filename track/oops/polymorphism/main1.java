package track.oops.polymorphism;

class parent {
    void display1() {
        System.out.println("Inside parent display1");
    }

    void display2() {
        System.out.println("inside parent display2");
    }
}

class child1 extends parent {
    @Override
    void display2() {
        System.out.println("inside child1 display2");
    }

    void display3() {
        System.out.println("inside child1 display 3");
    }
}

class child2 extends parent {
    @Override
    void display2() {
        System.out.println("inside child2 display 2");
    }

    void display3() {
        System.out.println("inside child2 display 3");
    }
}

public class main1 {
    public static void main(String[] args) {
        child1 c1 = new child1();
        accessMethod(c1);
        child2 c2 = new child2();
        accessMethod(c2);
    }

    // UPCASTING
    static void accessMethod(parent p) {
        p.display1();
        p.display2();
        if (p instanceof child1) {
            ((child1) (p)).display3(); // DOWNCASTING
        } else {
            ((child2) (p)).display3(); // DOWNCASTING
        }
    }
}
