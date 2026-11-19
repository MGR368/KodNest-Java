package track.threads;

public class pgm1 {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println(t1);
        t1.setName("bilva");
        System.out.println(t1);
        t1.setPriority(7);
        System.out.println(t1);
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1);
        t1.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1);
        System.out.println(t1.getName());
        System.out.println(t1.getPriority());
        System.out.println(t1.getClass());
    }

}
