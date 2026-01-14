package DP;

public class UnboundedKnapsack {
    public int knapSack(int val[], int wt[], int C) {
        int n = val.length;
        int[][] dp = new int[n][C+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<=C;j++){
                dp[i][j] = -1;
            }
        }
        return maxLoot(n-1,C,val,wt,dp);
    }
    // i: n-1 to 0   C:C to 0
    private int maxLoot(int i, int C, int[] val, int[] wt, int[][] dp) {
        if(i<0) return 0;
        if(dp[i][C]!=-1) return dp[i][C];
        if(C-wt[i] >= 0) {
            int pick = val[i] + maxLoot(i , C - wt[i], val, wt, dp);
            int skip = maxLoot(i-1,C,val,wt,dp);
            return dp[i][C] = Math.max(pick,skip);
        }
        else{
            int skip = maxLoot(i-1,C,val,wt,dp);
            return dp[i][C] = skip;
        }
    }
}
