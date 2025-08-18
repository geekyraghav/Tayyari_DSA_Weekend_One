class Solution {
    public int findFloor(int[] arr, int target) {
        int n = arr.length;
        int lo = 0, hi = n - 1;
        int ans = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>target) hi = mid - 1;
            else{ // arr[mid] <= target
                ans = mid;
                lo = mid + 1;
            }
        }
        return ans;
    }
}
