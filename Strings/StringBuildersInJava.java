package Strings;
import java.util.Scanner;
public class StringBuildersInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        char ch = sc.next().charAt(0);
//        System.out.println(ch);
        StringBuilder s = new StringBuilder(sc.nextLine());
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        s.setCharAt(0,'Z');
        System.out.println(s);
        s.reverse(); // this will reverse the string
        System.out.println(s);

        String str = s.toString(); // sb se s
        StringBuilder sb = new StringBuilder(str);
    }
}
