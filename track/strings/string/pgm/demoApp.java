package track.strings.string.pgm;

class Demo {
    static int count = 0;
    {
        count++;
    }
}

public class demoApp {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();
        System.out.println("no.of objects: " + Demo.count);
    }

}
