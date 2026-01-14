package DP;

public class PartitionEqualSubsetSum {
    static boolean equalPartition(int arr[]) {
        int arraySum = 0;
        for(int ele : arr) arraySum += ele;
        if(arraySum%2==1) return false;
        int n = arr.length, target = arraySum/2;
        Boolean[][] dp = new Boolean[n][target+1]; // null, true, false
        return subset(0,target,arr,dp);
    }
    // i: 0 to n-1   target: target to 0
    private static boolean subset(int i, int target, int[] arr, Boolean[][] dp) {
        if(i==arr.length) return (target==0);
        if(dp[i][target]!=null) return dp[i][target];
        boolean skip = subset(i+1,target,arr,dp);
        if(target-arr[i] >= 0){
            boolean pick = subset(i+1,target-arr[i],arr,dp);
            return dp[i][target] = pick || skip;
        }
        else return dp[i][target] = skip;
    }
    // 1 2 3 true
    // 1 8 3 false
    // 1 5 5 9 true  1,9 & 5,5   VVIMP prefix sum nahi lagega
    // if arraySum is odd then ans is false
    // ** find a subset of array with sum = arraySum/2 **
    // proper pick and skip
    // 0/1 Knapsack
}
