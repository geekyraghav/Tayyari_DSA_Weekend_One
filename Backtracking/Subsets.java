package Backtracking;

import java.util.ArrayList;

public class Subsets {
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        generate(0,arr,new ArrayList<>(),ans);
        return ans;
    }
    public void generate(int i, int arr[], ArrayList<Integer> a, ArrayList<ArrayList<Integer>> ans) {
        if(i==arr.length){
            ans.add(new ArrayList<>(a));
            return;
        }
        generate(i+1,arr,a,ans); // skip
        a.add(arr[i]);
        generate(i+1,arr,a,ans); // pick
        a.remove(a.size()-1); // backtracking
    }
}
