package Strings;

public class PalindromeString2 {
    public static void main(String[] args) {
        String s = " a2b    {Cc {B2A";
        System.out.println(isPalindrome(s));
    }

    private static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while(i<=j){
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if(ci==' ') i++;
            else if(cj==' ') j--;
            else{
                if(ci>=65 && ci<=90) ci = (char)(ci + 32);
                if(cj>=65 && cj<=90) cj = (char)(cj + 32);
                if(ci!=cj) return false;
                i++;
                j--;
            }
        }
        return true;
    }
}
