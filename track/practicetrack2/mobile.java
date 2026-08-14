package track.practicetrack2;

public class mobile {
    void unlock(face f){
        System.out.println("Face id unlock");
    }
    void unlock(fingerprint fp){
        System.out.println("Fingerprint unlock");
    }
    void unlock(int number){
        System.out.println("Pin unlock");
    }
    void unlock(pattern p){
        System.out.println("Pattern unlock");
    }
    void unlock(String text){
        System.out.println("Text unlock");
    }
}

class face{

}
class fingerprint{

}
class pattern{

}




