class Solution {
    public boolean searchMatrix(int[][] arr, int target) { // Method 2 Jui 
        int rows = arr.length, cols = arr[0].length;
        // search the least number >= target in last col
        int lo = 0, hi = rows - 1, ansRow = 0;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid][cols-1] >= target){
                hi = mid - 1;
                ansRow = mid;
            } 
            else lo = mid + 1;
        }
        // ansRow wali row me binary search lagao
        lo = 0;
        hi = cols - 1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[ansRow][mid] > target) hi = mid - 1;
            else if(arr[ansRow][mid] < target) lo = mid + 1;
            else return true;
        }
        return false;
    }
    // public boolean searchMatrix(int[][] arr, int target) { // Method 1
    //     int rows = arr.length, cols = arr[0].length;
    //     int lo = 0, hi = rows*cols - 1;
    //     while(lo<=hi){
    //         int mid = (lo+hi)/2;
    //         int midRow = mid/cols, midCol = mid%cols;
    //         if(arr[midRow][midCol] > target) hi = mid - 1;
    //         else if(arr[midRow][midCol] < target) lo = mid + 1;
    //         else return true;
    //     }
    //     return false;
    // }
    
}
