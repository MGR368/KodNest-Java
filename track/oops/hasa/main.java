package track.oops.hasa;

class OS {
    OS() {
        System.out.println("OS created");
    }

    void checkOs() {
        System.out.println("OS is still creating...");
    }
}

class Mobile {
    OS o = new OS();

    Mobile() {
        System.out.println("Mobile created with OS");
    }
}

public class main {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.o.checkOs();
        m = null;
        //m.o.checkOs();
    }
}
