package track.oops.inheritance;

class parent {
    parent() {
        System.out.println("inside 0 parent constructor");
    }
}

class child extends parent {
    child() {
        this(10);
        System.out.println("inside 0 child constructor");
    }

    child(int a) {
        this(10, 20);
        System.out.println("inside 1 child constructor");
    }

    child(int a, int b) {
        System.out.println("inside 2 child constructor");
    }
}

public class localChaining {
    public static void main(String[] args) {
        child c = new child();

    }
}
