package Strings;

public class BuiltInStringMethods {
    public static void main(String[] args) {
        String s = "Raghav Garg";

        System.out.println(s.startsWith("ragh"));
        System.out.println(s.endsWith("hav Garg"));
        System.out.println(s.contains("hav Ga"));

        System.out.println(s.indexOf('g'));
        System.out.println(s.lastIndexOf('g'));

        String x = s.toUpperCase(); // not doing anything to s
        System.out.println(x+" "+s);
        // s = s.toLowerCase(); // to change in s
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());
    }
}
