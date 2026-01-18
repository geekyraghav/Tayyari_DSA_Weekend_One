package DP;
import java.util.ArrayList;
import java.util.Arrays;
public class LIS {
    static int lis(int arr[]) { // Binary Search
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i] > ans.get(ans.size()-1)) ans.add(arr[i]);
            else{ // lb is the least element which is >= arr[i]
                int idx = lowerBound(ans,arr[i]);
                ans.set(idx,arr[i]);
            }
        }
        return ans.size();
    }

    static int lowerBound(ArrayList<Integer> ans, int ele) {
        int lo = 0, hi = ans.size()-1, idx = 0;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(ans.get(mid) >= ele){ // possible lower bound
                idx = mid;
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        return idx;
    }

//    static int lis(int arr[]) { // DP
//        int n = arr.length;
//        int[] dp = new int[n];
//        Arrays.fill(dp,1); // 6 5 4 3 2 1
//        int len = 1;
//        for(int i=1;i<n;i++){
//            for(int j=i-1;j>=0;j--){
//                if(arr[i] > arr[j]){
//                    dp[i] = Math.max(dp[i],1 + dp[j]);
//                }
//            }
//            len = Math.max(len,dp[i]);
//        }
//        // return dp[n-1]; // wrong // 1 2 3 4 2
//        return len;
//    }
}
