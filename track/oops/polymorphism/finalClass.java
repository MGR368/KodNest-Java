package track.oops.polymorphism;

class pgm1 {
    final void display1() {
        System.out.println("Inside pgm1 disp1");
    }

    void display2() {
        System.out.println("Inside pgm1 disp2");
    }

}

class pgm2 extends pgm1 {
    @Override
    void display2() {
        System.out.println("child disp2");
    }
}

public class finalClass {
    public static void main(String[] args) {
        pgm2 p2 = new pgm2();
        p2.display1();
        p2.display2();
    }

}
