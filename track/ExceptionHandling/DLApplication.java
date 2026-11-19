package track.ExceptionHandling;

import java.util.Scanner;

class UnderAgeException extends Exception {
    UnderAgeException() {
        super("You are too young..., still have a time");
    }
}

class DrivingLicence {
    int age;

    void takeUserAge() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your AGE : ");
        age = scan.nextInt();
    }

    void verify() throws UnderAgeException {
        if (age < 18) {
            // UnderAgeException uae = new UnderAgeException();
            // throw uae;

            throw new UnderAgeException();
        } else {
            System.out.println("DrivingLicence will be issued");
        }
    }
}

class DLApplication {
    public static void main(String[] args) {
        DrivingLicence dl = new DrivingLicence();
        dl.takeUserAge();

        try {
            dl.verify();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}