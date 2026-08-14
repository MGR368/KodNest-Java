package track.practicetrack;

public class Passenger {
    public static void main(String[] args) {
        Conductor c = new Conductor();
        money m = new money();
        c.collect(m);
        Ticket t = c.give();
        // System.out.println(t);
        if (t != null) {
            System.out.println("Ticket Collected");
        }

    }
}
