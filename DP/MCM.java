package DP;

public class MCM {
    static int matrixMultiplication(int arr[]) {
        int n = arr.length;
        int[][] dp = new int[n-1][n-1];
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                dp[i][j] = -1;
            }
        }
        return fun(0,n-2,arr,dp);
    }
    // i: 0 to n-2   j: n-2 to 0
    private static int fun(int i, int j, int[] arr, int[][] dp) {
        if(i==j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int minCost = Integer.MAX_VALUE;
        for(int k=i;k<j;k++){ // partition at k
            int cost = arr[i] * arr[k+1] * arr[j+1];
            int multiplications = fun(i,k,arr,dp) + fun(k+1,j,arr,dp) + cost;
            minCost = Math.min(minCost,multiplications);
        }
        return dp[i][j] = minCost;
    }
}
