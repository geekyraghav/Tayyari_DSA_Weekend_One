class Solution {
    boolean twoSum(int arr[], int target) {
        Arrays.sort(arr); // nlogn
        int n = arr.length;
        int i = 0, j = n-1;
        while(i<j){ // n
            if(arr[i]+arr[j] < target) i++;
            else if(arr[i]+arr[j] > target) j--;
            else return true;
        }
        return false;
    }
}
