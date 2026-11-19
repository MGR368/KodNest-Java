package track.ExceptionHandling;

import java.util.Scanner;

class UnderAgeException extends Exception {
    UnderAgeException() {
        super("You are too young..., still have a time");
    }
}

class OverAgeException extends Exception {
    OverAgeException() {
        super("Yor are tooo old..., take rest");
    }
}

class DrivingLicence {
    int age;

    void takeUserAge() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your AGE : ");
        age = scan.nextInt();
    }

    void verify() throws UnderAgeException, OverAgeException {
        if (age < 18) {
            // UnderAgeException uae = new UnderAgeException();
            // throw uae;

            throw new UnderAgeException();
        } else if (age > 65) {
            throw new OverAgeException();
        } else {
            System.out.println("DrivingLicence will be issued");
        }
    }
}

class DLApplication1 {
    public static void main(String[] args) {
        DrivingLicence dl = new DrivingLicence();
        dl.takeUserAge();

        try {
            dl.verify();
        } catch (UnderAgeException | OverAgeException e) {
            e.printStackTrace();
        }
    }
}