package DP;

import java.util.Arrays;

public class NthFibonacciNumber {

//    public int fibo(int n, int[] dp) {
//        if(n<=1) return n;
//        if(dp[n]!=-1) return dp[n]; // extra
//        return dp[n] = fibo(n-1,dp) + fibo(n-2,dp);
//    }
//    public int nthFibonacci(int n) {
//        int[] dp = new int[n+1]; // 0 to n index
//        Arrays.fill(dp,-1); // -1 means unvisited
//        return fibo(n,dp);
//    }

//    public int nthFibonacci(int n) { // tabulation
//        int[] dp = new int[n+1]; // 0 to n index
//        dp[0] = 0;
//        if(n>=1) dp[1] = 1;
//        for(int i=2;i<=n;i++){
//            dp[i] = dp[i-1] + dp[i-2];
//        }
//        return dp[n];
//    }

    public int nthFibonacci(int n) { // space optimised tabulation
        if(n<=1) return n;
        int[] dp = new int[3]; // 0 to n index
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            dp[2] = dp[1] + dp[0];
            dp[0] = dp[1];
            dp[1] = dp[2];
        }
        return dp[2];
    }
}
