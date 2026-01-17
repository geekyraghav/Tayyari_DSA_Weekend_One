package DP;

import java.util.*;

public class LCS {
    static int lcs(String s1, String s2) { // Tabulation Soch
        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[m][n];
    }

//    static int lcs(String s1, String s2) { // Tabulation
//        int m = s1.length(), n = s2.length();
//        int[][] dp = new int[m][n];
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                int x = (i>=1 && j>=1) ? dp[i-1][j-1] : 0;
//                int y = (i>=1) ? dp[i-1][j] : 0;
//                int z = (j>=1) ? dp[i][j-1] : 0;
//                if(s1.charAt(i)==s2.charAt(j)) dp[i][j] = 1 + x;
//                else dp[i][j] = Math.max(y,z);
//            }
//        }
//        return dp[m-1][n-1];
//    }

//    static int lcs(String s1, String s2) {
//        int m = s1.length(), n = s2.length();
//        int[][] dp = new int[m][n];
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                dp[i][j] = -1;
//            }
//        }
//        return helper(m-1,n-1,new StringBuilder(s1),new StringBuilder(s2),dp);
//    }
//    // i: m-1 to 0   j: n-1 to 0
//    static int helper(int i, int j, StringBuilder s1, StringBuilder s2, int[][] dp) {
//        if(i<0 || j<0) return 0;
//        if(dp[i][j]!=-1) return dp[i][j];
//        if(s1.charAt(i)==s2.charAt(j)) return dp[i][j] = 1 + helper(i-1,j-1,s1,s2,dp);
//        else return dp[i][j] = Math.max(helper(i-1,j,s1,s2,dp),helper(i,j-1,s1,s2,dp));
//    }
}
