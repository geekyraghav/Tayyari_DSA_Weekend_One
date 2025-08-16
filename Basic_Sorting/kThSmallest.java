class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // TC = O(n*k)   Selection Sort
        int n = arr.length;
        for(int i=0;i<k;i++){ // k passes
            int min = Integer.MAX_VALUE;
            int minIdx = -1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min = arr[j];
                    minIdx = j;
                }
            }
            // swap arr[i] and arr[minIdx]
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        return arr[k-1];
    }
}
