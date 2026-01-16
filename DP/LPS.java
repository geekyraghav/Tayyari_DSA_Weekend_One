package DP;

public class LPS {
    public int longestPalinSubseq(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        return lcs(s,sb.toString());
    }
    public int lcs(String s1, String s2) { // Tabulation
        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int x = (i>=1 && j>=1) ? dp[i-1][j-1] : 0;
                int y = (i>=1) ? dp[i-1][j] : 0;
                int z = (j>=1) ? dp[i][j-1] : 0;
                if(s1.charAt(i)==s2.charAt(j)) dp[i][j] = 1 + x;
                else dp[i][j] = Math.max(y,z);
            }
        }
        return dp[m-1][n-1];
    }
}
