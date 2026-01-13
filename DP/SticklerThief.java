package DP;

import java.util.Arrays;

public class SticklerThief {
    public int findMaxSum(int arr[]) { // space optimised tabulation
        int n = arr.length;
        int[] dp = new int[3]; // i : 0 to n-1
        dp[0] = arr[0];
        if(n>1) dp[1] = Math.max(arr[0],arr[1]);
        if(n<=2) return dp[n-1];
        for(int i=2;i<n;i++){
            dp[2] = Math.max(arr[i] + dp[0],dp[1]);
            dp[0] = dp[1];
            dp[1] = dp[2];
        }
        return dp[2];
    }

//    public int findMaxSum(int arr[]) { // tabulation
//        int n = arr.length;
//        int[] dp = new int[n]; // i : 0 to n-1
//        dp[0] = arr[0];
//        if(n>1) dp[1] = Math.max(arr[0],arr[1]);
//        for(int i=2;i<n;i++){
//            int pick = arr[i] + dp[i-2];
//            int skip = dp[i-1];
//            dp[i] = Math.max(pick,skip);
//        }
//        return dp[n-1];
//    }

//    public int findMaxSum(int arr[]) {
//        int[] dp = new int[arr.length]; // i : 0 to n-1
//        Arrays.fill(dp,-1);
//        return loot(arr,0,dp);
//    }
//
//    private int loot(int[] arr, int i, int[] dp) {
//        if(i>=arr.length) return 0;
//        if(dp[i]!=-1) return dp[i];
//        int pick = arr[i] + loot(arr,i+2,dp);
//        int skip = loot(arr,i+1,dp);
//        return dp[i] = Math.max(pick,skip); // dp[i] stores loot(i)
//    }
}
