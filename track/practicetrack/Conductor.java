package track.practicetrack;

public class Conductor {
    void collect(money m){
        System.out.println("Money collected by conductor");
    }
    Ticket give(){
        Ticket t = new Ticket();
        System.out.println("Ticket Issued");
        return t;
    }
}
