package track.oops.hasa;

class os {
    os() {
        System.out.println("os is installed");
    }

    void checkOs() {
        System.out.println("os is working properly");
    }
}

class charger {
    charger() {
        System.out.println("charger is connected");
    }

    void getCharger() {
        System.out.println("charger can be of any brand");
    }
}

class mobile {
    os o = new os();

    mobile() {
        System.out.println("mobile is created with os");
    }

    void hasA(charger c) {
        System.out.println("charger acquired");
    }
}

public class main2 {
    public static void main(String[] args) {
        mobile m = new mobile();
        charger c = new charger();
        m.hasA(c);
        c.getCharger();
        m = null;
        c.getCharger();
    }
}
