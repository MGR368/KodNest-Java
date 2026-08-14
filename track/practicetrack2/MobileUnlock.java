package track.practicetrack2;

public class MobileUnlock {
    public static void main(String[] args) {
        mobile m = new mobile();
        face f = new face();
        fingerprint fp = new fingerprint();
        pattern pt = new pattern();
        m.unlock(f);
        m.unlock(fp);
        m.unlock(pt);
        m.unlock(1234);
        m.unlock("abcd");
    }
}
