package track.practiceTrack75;

import java.util.*;

public class hashmap {
    public static void main(String[] args) {
        Map<Character, Double> freq = new HashMap<>();
        freq.put('g', 100.00);
        freq.put('a', 675.23);
        freq.put('z', 657.34);
        freq.put('t', freq.getOrDefault('t', 0.00));
        freq.put('g', freq.getOrDefault('g', 0.00) + 543.98);
        System.out.println(freq);
    }

}
