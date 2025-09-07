package AdvanceSorting;

public class Merge2SortedArrays {
    public static void main(String[] args) {
        int[] a = {3,8,11,17,21}; // m
        int[] b = {5,9,42,60}; // n
        int[] c = new int[a.length+b.length];
        merge(a,b,c);
        print(c);
    }

    private static void print(int[] c) {
        for(int ele : c){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    private static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while(i<a.length && j<b.length){
            if(a[i]<b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }
}
