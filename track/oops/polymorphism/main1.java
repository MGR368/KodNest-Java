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
        parent p = new child1(); // UPCASTING
        p.display1();
        p.display2();
        ((child1) (p)).display3(); // DOWNCASTING
    }
}
