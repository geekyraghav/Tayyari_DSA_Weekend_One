class Solution {
    int missingNum(int arr[]) {
        // TC = O(n)    // AS = O(1)
        // SC = O(n)
        int size = arr.length;
        long n = 1 + size;
        int sumOfArray = 0;
        for(int i=0;i<arr.length;i++){
            sumOfArray += arr[i];
        }
        int sum = (int)(n*(n+1)/2);
        return sum - sumOfArray;
    }
    
    // int missingNum(int arr[]) {
    //     // TC = O(n)    // AS = O(n)
    //     // SC = O(n)
    //     int size = arr.length;
    //     int n = 1 + size;
    //     // 1 se n tak elements hone chahiye
    //     boolean[] check = new boolean[n+1]; // 0 to n index ho
    //     for(int i=0;i<arr.length;i++){
    //         check[arr[i]] = true;
    //     }
    //     for(int i=1;i<check.length;i++){
    //         if(check[i]==false) return i;
    //     }
    //     return 2424;
    // }
    
    // int missingNum(int arr[]) {
    //     // TC = O(n^2)    // AS = O(1)
    //     // SC = O(n)
    //     int size = arr.length;
    //     int n = 1 + size;
    //     // 1 se n tak elements hone chahiye
    //     for(int i=1;i<=n;i++){
    //         boolean flag = false; // false means nahi mila
    //         for(int j=0;j<size;j++){
    //             if(i==arr[j]){
    //                 flag = true;
    //                 break;
    //             }
    //         }
    //         if(flag==false) return i;
    //     }
    //     return 2424;
    // }
    
}
