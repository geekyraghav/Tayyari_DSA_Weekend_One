package BinarySearchOnAns;
import java.util.Arrays;
public class AggressiveCows {
    // Minimax
    public int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        int n = stalls.length;
        int hi = stalls[n-1] - stalls[0], lo = hi;
        for(int i=1;i<n;i++){
            int diff = stalls[i] - stalls[i-1];
            if(diff < lo) lo = diff;
        }
        int ans = lo;
        while(lo <= hi){
            int mid = lo + (hi-lo)/2;
            if(canBePlaced(mid,stalls,k)){
                ans = mid;
                lo = mid + 1;
            }
            else hi = mid - 1;
        }
        return ans;
    }

    private boolean canBePlaced(int dist, int[] stalls, int k) {
        k--; // 1 2 5 7 10  k = 3  dist = 5
        int prevPlaced = stalls[0];
        for(int i=1;i<stalls.length;i++){
            if(stalls[i] - prevPlaced >= dist){ // place the cow
                k--;
                prevPlaced = stalls[i];
            }
            if(k==0) return true;
        }
        return false;
    }
}
