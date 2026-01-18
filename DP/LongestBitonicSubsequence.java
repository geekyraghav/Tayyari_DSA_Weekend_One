package DP;

import java.util.Arrays;

public class LongestBitonicSubsequence {
    public static int longestBitonicSequence(int n, int[] arr) {
        int[] dp1 = new int[n];
        Arrays.fill(dp1,1); // 6 5 4 3 2 1
        for(int i=1;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(arr[i] > arr[j]){
                    dp1[i] = Math.max(dp1[i],1 + dp1[j]);
                }
            }
        }
        int[] dp2 = new int[n];
        Arrays.fill(dp2,1); // 6 5 4 3 2 1
        for(int i=n-2;i>=0;i--){
            for(int j=i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    dp2[i] = Math.max(dp2[i],1 + dp2[j]);
                }
            }
        }
        int len = 1;
        for(int i=1;i<n-1;i++){
            if(dp1[i]!=1 && dp2[i]!=1)
                len = Math.max(len,dp1[i]+dp2[i]-1);
        }
        return len;
    }
}
