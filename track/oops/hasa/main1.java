package track.oops.hasa;

class heart {
    heart() {
        System.out.println("Heart is weak");
    }

    void checkHeart() {
        System.out.println("Heart is still weak...");
    }
}

class human {
    heart h = new heart();

    human() {
        System.out.println("human created with heart");
    }
}

public class main1 {
    public static void main(String[] args) {
        human m = new human();
        m.h.checkHeart();
        m = null;
        // m.o.checkOs();
    }
}
