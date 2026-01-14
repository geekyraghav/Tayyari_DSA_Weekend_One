package DP;

public class CoinChangeMinCoins {
    public int minCoins(int coins[], int sum) {
        long[][] dp = new long[coins.length][sum+1];
        for(int i=0;i<coins.length;i++){
            for(int j=0;j<=sum;j++){
                dp[i][j] = -1;
            }
        }
        long ans = minimumCoins(0,sum,coins,dp);
        return (ans>=Integer.MAX_VALUE) ? -1 : (int)ans;
    }
    // i: 0 to n-1   sum: sum to 0
    private long minimumCoins(int i, int sum, int[] coins, long[][] dp) {
        if(i==coins.length){
            if(sum==0) return 0;
            else return Integer.MAX_VALUE;
        }
        if(dp[i][sum]!=-1) return dp[i][sum];
        long skip = minimumCoins(i+1,sum,coins,dp);
        if(sum-coins[i] < 0) return dp[i][sum] = skip;
        else{
            long pick = 1 + minimumCoins(i,sum-coins[i],coins,dp);
            return dp[i][sum] = Math.min(pick,skip);
        }
    }
}
