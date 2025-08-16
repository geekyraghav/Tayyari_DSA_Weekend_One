class Solution {
    public boolean isSorted(int[] arr) {
        int n = arr.length;
        for(int i=0;i<=n-2;i++){
            if(arr[i]>arr[i+1]) return false;
        }
        return true;
    }
}
