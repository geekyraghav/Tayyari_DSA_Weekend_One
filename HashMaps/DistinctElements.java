package Heaps;

import java.util.ArrayList;
import java.util.HashSet;

public class DistinctElements {
    ArrayList<Integer> remDuplicate(int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for(int ele : arr)
            set.add(ele);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int ele : set)
            ans.add(ele);
        return ans;
    }
}
