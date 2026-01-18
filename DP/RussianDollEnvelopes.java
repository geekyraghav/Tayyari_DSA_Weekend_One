package DP;
import java.util.ArrayList;
import java.util.Arrays;
public class RussianDollEnvelopes {
    public int maxEnvelopes(int[][] arr) {
        // Sort on increasing len, and if len is same sort on decreasing breadth
        Arrays.sort(arr,(a,b)->((a[0]!=b[0]) ? a[0]-b[0] : b[1]-a[1]));
        // LIS on breadth
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[0][1]);
        for(int i=1;i<arr.length;i++){
            if(arr[i][1] > ans.get(ans.size()-1)) ans.add(arr[i][1]);
            else{ // lb is the least element which is >= arr[i]
                int idx = lowerBound(ans,arr[i][1]);
                ans.set(idx,arr[i][1]);
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
}
