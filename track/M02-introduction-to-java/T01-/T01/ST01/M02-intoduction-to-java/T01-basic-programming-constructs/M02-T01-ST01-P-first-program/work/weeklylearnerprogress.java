
public class weeklylearnerprogress {

    public static void main(String[] args) {

        // write your code here
        int Completedtopics = 17;
        int Totaltopics = 20;
        int Dailylearninghours = 3;
        int Learningdays = 5;

        int remainingtopics = Totaltopics - Completedtopics;

        int weeklylearninghours = Dailylearninghours * Learningdays;

        double progressPercentage = (double) Completedtopics * 100 / Totaltopics;

        System.out.println("Completed Topics: " + Completedtopics);
        System.out.println("Remaining Topics: " + remainingtopics);
        System.out.println("Weekly Learning Hours: " + weeklylearninghours);
        System.out.println("Progress Percentage: " + progressPercentage);
    }
}
