package track.strings.string.pgm;

class car {
    static void convertKmIntoMiles() {
        System.out.println("Converting KMs into Miles");
    }

    void calculateMilage() {
        System.out.println("Calculating Milage");
    }

}

public class stringMethod {
    public static void main(String[] args) {
        car nano = new car();
        nano.calculateMilage();

        car bmw = new car();
        bmw.calculateMilage();
    }
}
