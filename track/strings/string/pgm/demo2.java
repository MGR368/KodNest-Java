package track.strings.string.pgm;

class Demo2 {
    static {
        System.out.println("1st static block is executed");
    }
    static {
        System.out.println("2st static block is executed");
    }
    static {
        System.out.println("3rd static block is executed");
    }
    {
        System.out.println("1st non-static block is executed");
    }
    {
        System.out.println("2nd non-static block is executed");
    }
    {
        System.out.println("3rd non-static block is executed");
    }
}

public class demo2 {
    public static void main(String[] args) {
        Demo2 d1 = new Demo2();
        Demo2 d2 = new Demo2();
        Demo2 d3 = new Demo2();
    }

}
