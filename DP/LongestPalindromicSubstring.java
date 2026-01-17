package DP;

public class LongestPalindromicSubstring {
    public String getLongestPal(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int maxLen = 0;
        String ans = "";
        for(int k=0;k<n;k++){
            int i=0, j=k;
            while(j<n){
                if(i==j) dp[i][j] = true;
                else if(j==i+1){
                    if(s.charAt(i)==s.charAt(j)) dp[i][j] = true;
                }
                else{ // 3 or more length
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]) dp[i][j] = true;
                }
                if(dp[i][j]){ // palindromic substring found
                    int len = j-i+1;
                    if(len>maxLen){
                        maxLen = len;
                        ans = s.substring(i,j+1);
                    }
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}
