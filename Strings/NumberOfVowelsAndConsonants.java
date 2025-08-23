package Strings;

public class NumberOfVowelsAndConsonants {
    public static void main(String[] args) {
        String s = "4jbr2u4k4b5@#$%qrvkhwfwAJGFVSf;;;";
        int vowels = 0, consonants = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(isVowel(ch)) vowels++;
            else if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)) consonants++;
        }
        System.out.println(vowels+" "+consonants);
    }

    private static boolean isVowel(char ch) {
        if(ch=='a' || ch=='A') return true;
        if(ch=='e' || ch=='E') return true;
        if(ch=='i' || ch=='I') return true;
        if(ch=='o' || ch=='O') return true;
        if(ch=='u' || ch=='U') return true;
        return false;
    }
}
