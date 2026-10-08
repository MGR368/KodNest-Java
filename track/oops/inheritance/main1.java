package track.oops.inheritance;

class parent {
    parent() {
        System.out.println("inside 0 parent constructor");
    }

    parent(int a) {
        System.out.println("inside 1 parent constructor");
    }
}

class child extends parent {
    child() {
        super();
        System.out.println("inside 0 child constructor");
    }

    child(int a) {
        super(a);
        System.out.println("inside 1 child constructor");
    }
}

public class main1 {
    public static void main(String[] args) {
        child c = new child();
    }
}
