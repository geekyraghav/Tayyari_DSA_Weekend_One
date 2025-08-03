// User function Template for Java

class Solution {
    void segregate0and1(int[] arr) {
        int i = 0, j = arr.length-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if(arr[j]==1) j--;
            else if(arr[i]==1 && arr[j]==0){
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
    }
    // void segregate0and1(int[] arr) {
    //     // 1 0 0 1 1 1 0 1 0 1 1 0 1
    //     // 0 0 0 0 0 1 1 1 1 1 1 1 1
    //     int countOfZeros = 0;
    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]==0) countOfZeros++;
    //     }
    //     // fill 
    //     for(int i=0;i<arr.length;i++){
    //         if(i<countOfZeros) arr[i] = 0;
    //         else arr[i] = 1;
    //     }
    // }
}
