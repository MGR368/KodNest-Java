package track.Arrays.oneDimensionalArrays;

public class traceArrayState {
    
    public static void main(String[] args) {
        int[] original = {14, 18, 22, 26};
        // write thte required variables as given
        int updateIndex = 1;
        int updateValue = 25;
        int requestedIndex = 4;

        int[] snapshot = new int[original.length];
        // Copy every element into snapshot.
        int j = 0;
        for (int i = 0 ; i <= original.length-1; i++) {
            snapshot[j] = original[i];
            j++;
        }

        int[] liveView = original;
        // Update through liveView.
        if (updateIndex >= 0 && updateIndex < liveView.length) {
            liveView[updateIndex] = updateValue;
        }

        // Display original, snapshot and the reference comparison.
        System.out.print("Original: ");
        for (int value : original) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.print("Snapshot: ");
        for (int value : snapshot) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.println("Same object: " + (original == liveView));

        System.out.print("Requested value: ");
        if (requestedIndex >= 0 && requestedIndex < original.length) {
            System.out.println(original[requestedIndex]);
        } else {
            System.out.println("Invalid index");
        }
    }
}

