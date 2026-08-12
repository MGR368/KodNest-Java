public class placement {
    public static void main(String[] args) {
        int marks = 68;
        int attendance = 80;
        int practiceDays = 3;

        // Write your code here

        if( marks >= 60 && attendance >= 75){
            String message = ( marks >= 60 && attendance >= 75) ? "Placement Ready" : "Continue Preparation";
            System.out.println(message);
        }

        for(int i = 1 ;i <= 3;i++){

            System.out.println("Practice Day: " + i);
        }

    }
}