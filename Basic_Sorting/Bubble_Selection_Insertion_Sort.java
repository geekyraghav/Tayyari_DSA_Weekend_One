package Basic_Sorting_Algorithms;

import java.util.Arrays;

public class Bubble_Selection_Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {5,4,30,2,11,9};
        print(arr);
        Arrays.sort(arr);
        // insertionSort(arr);
        // selectionSort(arr);
        // bubbleSort(arr);
        print(arr);
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for(int i=1;i<n;i++){
            int j = i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++){ // n-1 passes
            int min = Integer.MAX_VALUE;
            int minIdx = -1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min = arr[j];
                    minIdx = j;
                }
            }
            // swap arr[i] and arr[minIdx]
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++){ // n-1 passes
            int swaps = 0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){ // swap
                    swaps++;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            if(swaps==0) break;
        }
        // n-1 + n-2 + n-3 + n-4 + .. 3 + 2 + 1 = (n-1)*n/2 = no of operations
        // T.C. = O(n^2)       A.S. = O(1)   Best Case TC = O(n)
    }

    private static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
