package Recursion;

public class BinarySearchRecursive {
    public int binary(int lo, int hi, int[] arr, int target) {
        if(lo>hi) return -1;
        int mid = (lo+hi)/2;
        if(arr[mid]==target) return mid;
        else if(arr[mid]>target) return binary(lo,mid-1,arr,target);
        else return binary(mid+1,hi,arr,target);
    }
    public int search(int[] arr, int target) {
        return binary(0,arr.length-1,arr,target);
    }
}
