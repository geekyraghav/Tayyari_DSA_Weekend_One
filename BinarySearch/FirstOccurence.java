class Solution {
    // public int binarysearch(int[] arr, int target) {
    //     int n = arr.length;
    //     int lo = 0, hi = n - 1;
    //     while(lo<=hi){
    //         int mid = (lo+hi)/2;
    //         if(arr[mid]>=target) hi = mid - 1;
    //         else lo = mid + 1;
    //     }
    //     return (lo<n && arr[lo]==target) ? lo : -1;
    // }
    public int binarysearch(int[] arr, int target) {
        int n = arr.length;
        int lo = 0, hi = n - 1;
        int ans = -1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>target) hi = mid - 1;
            else if(arr[mid]<target) lo = mid + 1;
            else{
                ans = mid;
                hi = mid - 1;
            }
        }
        return ans;
    }
}
