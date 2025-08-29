package Strings;
public class Append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Sachin");
        System.out.println(sb);
        sb.append("Raj");
        System.out.println(sb);
        sb.append(353);
        System.out.println(sb);
        char[] arr = {'A','r','y','a','n'};
        sb.append(arr);
        System.out.println(sb);
    }
}
