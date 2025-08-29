package Strings;

public class ComparingTwoStrings {
    public static void main(String[] args) {
        String s1 = "Sitaram";
        String s2 = "Sitaram";
        String s3 = new String("Sitaram");
        System.out.println(s1==s3); // address compare karta hai
        System.out.println(s1.equals(s3)); // text compare
        // s1.charAt(0) = 'Y'; // ERROR
    }
}
