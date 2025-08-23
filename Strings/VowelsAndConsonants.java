package Strings;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        String s = "aiueotmnsw";
        int v = 0;
        int c = 0;

        // Your code here
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') v++;
            else c++;
        }

        if (v > c)
            System.out.print("Yes");
        else if (c > v)
            System.out.print("No");
        else
            System.out.print("Same");

        System.out.println();
    }
}
