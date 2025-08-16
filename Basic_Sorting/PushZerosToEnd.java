class Solution {
    // void pushZerosToEnd(int[] arr) {
    //     int n = arr.length;
    //     int[] brr = new int[n];
    //     int idx = 0;
    //     for(int i=0;i<n;i++){ 
    //         if(arr[i]>0) brr[idx++] = arr[i];
    //     }
    //     for(int i=0;i<n;i++){ 
    //         arr[i] = brr[i];
    //     }
    // }
    void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++){ // n-1 passes
            int swaps = 0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]==0){ // swap
                    swaps++;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(swaps==0) break;
        }
    }
}
