import java.util.Scanner;

class Student {
    // Declare registrationId, name and attendancePercentage
    int registrationId;
    String name;
    double attendancePercentage;
}

public class studentRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create and populate firstStudent
        Student firstStudent = new Student();
        firstStudent.registrationId = scanner.nextInt();
        firstStudent.name = scanner.next();
        firstStudent.attendancePercentage = scanner.nextDouble();

        // Create and populate secondStudent
        Student secondStudent = new Student();
        secondStudent.registrationId = scanner.nextInt();
        secondStudent.name = scanner.next();
        secondStudent.attendancePercentage = scanner.nextDouble();

        // Read the selected ID and new attendance
        int selectedId = scanner.nextInt();
        double newAttendance = scanner.nextDouble();

        Student selectedStudent = null;

        // Find matching student
        if (selectedId == firstStudent.registrationId) {
            selectedStudent = firstStudent;
        } else if (selectedId == secondStudent.registrationId) {
            selectedStudent = secondStudent;
        }

        // Update attendance or print not found
        if (selectedStudent != null) {
            selectedStudent.attendancePercentage = newAttendance;
            System.out.println("Selected Student: " + selectedStudent.name);
        } else {
            System.out.println("Student not found.");
        }

        // Display both records
        System.out.println(firstStudent.registrationId + " - " + firstStudent.name + " - " + firstStudent.attendancePercentage + "%");
        System.out.println(secondStudent.registrationId + " - " + secondStudent.name + " - " + secondStudent.attendancePercentage + "%");

        scanner.close();
    }
}
