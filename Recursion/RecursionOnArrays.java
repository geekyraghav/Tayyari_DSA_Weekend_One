package Recursion;

public class RecursionOnArrays {
    public static void main(String[] args) {
        int[] arr = {8,3,7,14,420,5,21,11,63};
        // print(arr,0);
        // System.out.println(sum(arr,0));
        System.out.println(max(arr,0));
    }

    public static int max(int[] arr, int i) {
        if(i==arr.length) return Integer.MIN_VALUE;
        return Math.max(arr[i],max(arr,i+1));
    }

    public static int sum(int[] arr, int i) {
        if(i==arr.length) return 0;
        return arr[i] + sum(arr,i+1);
    }

    public static void print(int[] arr, int i) {
        if(i==arr.length) return;
        System.out.print(arr[i]+" ");
        print(arr,i+1);
    }
}
