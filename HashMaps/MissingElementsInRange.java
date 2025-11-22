package Heaps;

import java.util.ArrayList;
import java.util.HashSet;

public class MissingElementsInRange {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr) set.add(ele);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=low;i<=high;i++){
            if(!set.contains(i)) ans.add(i);
        }
        return ans;
    }
}
