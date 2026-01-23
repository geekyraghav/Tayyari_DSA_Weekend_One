package CyclicSort;

import java.util.ArrayList;

public class SmallestPositiveMissing {
    public int missingNumber(int[] arr) {
        // Cyclic Sort (1-n)
        int i = 0, n = arr.length;
        while(i<n){
            int idx = arr[i] - 1;
            if(arr[i] == i+1 || arr[i] <= 0 || arr[i] > n || arr[i] == arr[idx]) i++;
            else{ // put arr[i] in correct place
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }
        for(i=0;i<arr.length;i++){
            if(arr[i] != i+1) return i+1;
        }
        return i+1;
    }
}
