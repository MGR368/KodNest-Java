package track.strings.string.pgm;

public class stringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());// 16
        System.out.println(sb.length());// 0

        sb.append("java");
        System.out.println(sb);
        System.out.println(sb.capacity());// 16
        System.out.println(sb.length());// 4

        sb.append(" is a programming language");
        System.out.println(sb);
        System.out.println(sb.capacity());// 34
        System.out.println(sb.length());// 30

        sb.append(" and object oriented");
        System.out.println(sb);
        System.out.println(sb.capacity());// 70
        System.out.println(sb.length());// 50

    }
}
