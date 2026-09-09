package track.strings.string.pgm;

public class stringMethod1 {
    public static void main(String[] args) {
        String s1 = "KodNest";
        System.out.println(s1.isBlank());
        System.out.println(s1.isEmpty());

        String s2 = " ";
        System.out.println(s2.isBlank());
        System.out.println(s2.isEmpty());

        String s3 = "";
        System.out.println(s3.isBlank());
        System.out.println(s3.isEmpty());

        String s4 = "        KodNest ";
        System.out.println(s4);
        System.out.println(s4.trim());

        String s5 = "java";
        String res = s5.toUpperCase();
        System.out.println(res);
        System.out.println(s5);

    }
}
