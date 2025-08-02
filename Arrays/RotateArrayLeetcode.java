class Solution {
    public void reverse(int[] arr, int i, int j) {
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k %= n;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        
    }
}
