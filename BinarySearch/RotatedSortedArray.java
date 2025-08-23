class Solution {
    int search(int[] arr, int target) {
        //  5 6 7 8 9 12 1 2 3    tar = 2
        int n = arr.length;
        int lo = 0, hi = n-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==target) return mid;
            if(arr[lo]<=arr[mid]){ // lo to mid sorted
                if(arr[lo] <= target && target <= arr[mid]) hi = mid - 1;
                else lo = mid + 1;
            }
            else{ // mid to hi sorted
                if(arr[mid] <= target && target <= arr[hi]) lo = mid + 1;
                else hi = mid - 1;
            }
        }
        return -1;
    }
}
