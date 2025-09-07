package Recursion;

public class CountAndSay {
    public String countAndSay(int n) {
        if(n==1) return "1";
        String s = countAndSay(n-1) + '#';
        String ans = "";
        int i = 0, j = 0;
        int m = s.length();
        while(j<m){
            if(s.charAt(i)==s.charAt(j)) j++;
            else{
                int len = j - i;
                ans += len;
                ans += s.charAt(i);
                i = j;
            }
        }
        // int len = j - i;
        // ans += len;
        // ans += s.charAt(i);
        return ans;
    }
}
