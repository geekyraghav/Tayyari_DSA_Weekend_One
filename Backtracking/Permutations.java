package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Permutations {
    public static ArrayList<ArrayList<Integer>> permuteDist(int[] arr) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        generate(0,arr,ans);
        return ans;
    }

    private static void generate(int idx, int[] arr, ArrayList<ArrayList<Integer>> ans) {
        int n = arr.length;
        if(idx==n-1){ // we have a valid permutation
            ArrayList<Integer> a = new ArrayList<>();
            for(int ele : arr) a.add(ele);
            ans.add(a);
            return;
        }
        // swap idx with i=idx to n-1
        for(int i=idx;i<n;i++){
            swap(i,idx,arr);
            generate(idx+1,arr,ans);
            swap(i,idx,arr); // backtracking
        }
    }

    private static void swap(int i, int j, int[] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
