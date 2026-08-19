package track.Arrays.oneDimensionalArrays;

class Freq {
    void count(int ref[] ,int key){
        int count = 0;
        for(int i = 0 ; i <= ref.length-1 ; i++){
            if(ref[i] == key){
                count++;
            }
        }
        System.out.println(key +" : "+count);
    }
}

public class ArrayCount {
    public static void main(String[] args){
        int[] arr = {10,20,30,10,30,10,40,20,50};
        Freq fs = new Freq();
        fs.count(arr,10);
        
    }
    
}
