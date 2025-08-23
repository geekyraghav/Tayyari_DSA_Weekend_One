package Strings;

public class StringToIntegerAndIntegerToString {
    public static void main(String[] args) {
        int n = 24646;
        // String s = "" + n;
        String s = Integer.toString(n);
        System.out.println(s);

//        String str = "524556";
//        int x = Integer.parseInt(str);
//        System.out.println(x+1);
        String str = "64713458689696";
        long x = Long.parseLong(str);
        System.out.println(x+1);
    }
}
