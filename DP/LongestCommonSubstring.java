package DP;

public class LongestCommonSubstring {
    public int longestCommonSubstr(String s1, String s2) {
        int m = s1.length(), n = s2.length(), maxLen = 0;
        int[][] dp = new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = 0;
                maxLen = Math.max(maxLen,dp[i][j]);
            }
        }
//        // Print the longest common substring
//        int i=1,j=1;
//        for(i=1;i<=m;i++){
//            boolean flag = true;
//            for(j=1;j<=n;j++){
//                if(dp[i][j]==maxLen){
//                    flag = false;
//                    break;
//                }
//            }
//            if(!flag) break;
//        }
//        StringBuilder substr = new StringBuilder("");
//        while(dp[i][j]!=0){
//            substr.append(s1.charAt(i-1));
//            i--;
//            j--;
//        }
//        substr.reverse();
        return maxLen;
    }
}
