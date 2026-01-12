package DP;

import java.util.Arrays;

public class MinCostClimbingStairs {
    static int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(minCost(cost,0,dp),minCost(cost,1,dp));
    }

    static int minCost(int[] cost, int i, int[] dp) { // i : 0 to n-1
        if(i>=cost.length) return 0;
        if(dp[i]!=-1) return dp[i];
        return dp[i] = cost[i] + Math.min(minCost(cost,i+1,dp),minCost(cost,i+2,dp));
    }
}
