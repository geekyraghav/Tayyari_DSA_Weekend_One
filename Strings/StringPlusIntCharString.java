package Strings;

public class StringPlusIntCharString {
    public static void main(String[] args) {
        String s = "abc";
        s = s + 10;
        System.out.println(s);
        s = 20 + s;
        System.out.println(s);
        s += 23;
        System.out.println(s);
        s += 't';
        s = 'r' + s;
        System.out.println(s);
        s += "raghav";
        System.out.println(s);
    }
}
