class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int lo = 1, hi = n - 2;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid-1]<arr[mid] && arr[mid]<arr[mid+1]) lo = mid + 1;
            else if(arr[mid-1]>arr[mid] && arr[mid]>arr[mid+1]) hi = mid - 1;
            else return mid;
        }
        return 3553;
    }
}
