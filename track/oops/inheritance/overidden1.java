package track.oops.inheritance;

class parent {
    void disp1() {
        System.out.println("Inside parent disp1");
    }

    void disp2() {
        System.out.println("inside parent disp2");
    }
}

class child extends parent {
    @Override
    void disp2() {
        System.out.println("inside child disp2");
    }

    void disp3() {
        System.out.println("inside child disp3");
    }
}

public class overidden1 {
    public static void main(String[] args) {
        child c = new child();
        c.disp1();
        c.disp2();
        c.disp3();
    }
}
