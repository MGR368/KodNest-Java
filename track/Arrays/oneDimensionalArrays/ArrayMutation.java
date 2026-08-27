package track.Arrays.oneDimensionalArrays;

public class ArrayMutation{
    public static void main(String[] args) {
        // Write your code here.
        int[] readings = {12, 14, 16, 18};
        int updateindex = 2;
        int newValue = 25;

        int[] snapShot = new int[readings.length];
        System.out.print("Snapshot: ");
        for(int i =0; i<= snapShot.length-1;i++) {
            snapShot[i] = readings[i];
            System.out.print(snapShot[i] + " ");
        }
        System.out.println();
        int[] updated = new int[readings.length];
        System.out.print("Updated: ");
        for(int i =0 ;i <= readings.length-1;i++) {
            
            readings[updateindex] = newValue;
            
            System.out.print(readings[i] + " ");
        }
    }
}
