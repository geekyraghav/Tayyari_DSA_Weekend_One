package Strings;
import java.util.Scanner;
public class StringAsADataType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String x = sc.next();
        String x = sc.nextLine();
        for(int i=0;i<x.length();i++){
            System.out.print(x.charAt(i)+" ");
        }
//        String s = "Saksham is a good boy";
//        System.out.println(s+" "+s.length());
//        System.out.println(s.charAt(2)); // s[2]
//
//        String str = "Aditya";
//        System.out.println(str);
//        for(int i=0;i<str.length();i++){ // traverse
//            System.out.print(str.charAt(i)+" ");
//        }
    }
}
