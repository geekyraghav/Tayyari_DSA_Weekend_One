package Strings;

public class Concatenation {
    public static void main(String[] args) {
        String x = "abc";
        String y = "def";

        String z = x.concat(y); // x and y won't be changed
        System.out.println(x.concat(y));
        System.out.println(x);
        System.out.println(y);
    }
}
