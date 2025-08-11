class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length, n = arr[0].length;
        int i = 0, j = n-1;
        while(i<m && j>=0){ // T.C. = O(m+n)
            if(arr[i][j] > target) j--;
            else if(arr[i][j] < target) i++;
            else return true;
        }
        // for(int i=0;i<m;i++){ // T.C. = O(m*n)
        //     for(int j=0;j<n;j++){
        //         if(arr[i][j]==target) return true;
        //     }
        // }
        return false;
    }
}
