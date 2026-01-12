package DP;

import java.util.Arrays;

public class SticklerThief {
    public int findMaxSum(int arr[]) {
        int[] dp = new int[arr.length]; // i : 0 to n-1
        Arrays.fill(dp,-1);
        return loot(arr,0,dp);
    }

    private int loot(int[] arr, int i, int[] dp) {
        if(i>=arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int pick = arr[i] + loot(arr,i+2,dp);
        int skip = loot(arr,i+1,dp);
        return dp[i] = Math.max(pick,skip); // dp[i] stores loot(i)
    }
}
