class Solution {
    public int getSecondLargest(int[] arr) {
        int max = -1, smax = -1;
        for(int i=0;i<arr.length;i++)
            if(arr[i]>max) max = arr[i];

        for(int i=0;i<arr.length;i++)
            if(arr[i]>smax && arr[i]!=max) smax = arr[i];
        
        return smax;
    }
    // public int getSecondLargest(int[] arr) {
    //     int max = -1, smax = -1;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]>max){
    //             smax = max;
    //             max = arr[i];
    //         } 
    //         else if(arr[i]>smax && arr[i]!=max) smax = arr[i];
    //     }
    //     return smax;
    // }
}
