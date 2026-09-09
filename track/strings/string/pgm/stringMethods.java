package track.strings.string.pgm;

public class stringMethods {
    public static void main(String[] args) {
        String str = "KodNest Technologies";
        System.out.println(str);

        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        System.out.println(str.charAt(3));

        System.out.println(str.contains("Nest"));
        System.out.println(str.contains("nest"));

        System.out.println(str.startsWith("Kod"));
        System.out.println(str.startsWith("Nest"));

        System.out.println(str.endsWith("ies"));
        System.out.println(str.endsWith("Tec"));

        System.out.println(str.indexOf('k'));
        System.out.println(str.indexOf('o'));

        System.out.println(str.length());
        System.out.println(str.replace('e','m'));

        System.out.println(str.substring(5));
        System.out.println(str.substring(5,9));     
        
    }   
}
