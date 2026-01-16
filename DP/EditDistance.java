package DP;

public class EditDistance {
    public int editDistance(String s1, String s2) { // tabulation
        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int replace = (i>=1 && j>=1) ? dp[i-1][j-1] : ((i-1==-1) ? j-1+1 : i);
                if(s1.charAt(i)==s2.charAt(j)) dp[i][j] = replace;
                else{
                    int insert = (j>=1) ? dp[i][j-1] : i+1;
                    int remove = (i>=1) ? dp[i-1][j] : j+1;
                    dp[i][j] = 1 + Math.min(replace,Math.min(insert,remove));
                }
            }
        }
        return dp[m-1][n-1];
    }

//    public int editDistance(String s1, String s2) {
//        int m = s1.length(), n = s2.length();
//        int[][] dp = new int[m][n];
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                dp[i][j] = -1;
//            }
//        }
//        return operations(m-1,n-1,new StringBuilder(s1),new StringBuilder(s2),dp);
//    }
//
//    private int operations(int i, int j, StringBuilder s1, StringBuilder s2, int[][] dp) {
//        if(i<0) return j+1;
//        if(j<0) return i+1;
//        if(dp[i][j]!=-1) return dp[i][j];
//        if(s1.charAt(i)==s2.charAt(j)) return dp[i][j] = operations(i-1,j-1,s1,s2,dp);
//        else{
//            int replace = operations(i-1,j-1,s1,s2,dp);
//            int insert = operations(i,j-1,s1,s2,dp);
//            int remove = operations(i-1,j,s1,s2,dp);
//            return dp[i][j] = 1 + Math.min(replace,Math.min(insert,remove));
//        }
//    }
}
