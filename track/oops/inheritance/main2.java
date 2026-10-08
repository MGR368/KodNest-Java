package track.oops.inheritance;

class parent {
    int a = 10;
}

class child extends parent {
    int a = 20;

    void disp2() {
        System.out.println("parents a : " + super.a);
        System.out.println("childs a : " + a);
    }
}

public class main2 {
    public static void main(String[] args) {
        child c = new child();
        c.disp2();
    }
}
