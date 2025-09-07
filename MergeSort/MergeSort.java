package AdvanceSorting;

public class MergeSort { // O(nlogn)
    public static void main(String[] args) {
        int[] arr = {56,11,8,17,25,6,33,0,63};
        print(arr);
        mergeSort(arr);
        print(arr);
    }

    private static void mergeSort(int[] arr) {
        int n = arr.length;
        if(n==1) return; // 1 length array is always sorted
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        for(int i=0;i<a.length;i++) a[i] = arr[i];
        for(int i=0;i<b.length;i++) b[i] = arr[i+n/2];
        mergeSort(a);
        mergeSort(b);
        merge(a,b,arr);
    }

    private static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }

    private static void print(int[] c) {
        for(int ele : c){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
