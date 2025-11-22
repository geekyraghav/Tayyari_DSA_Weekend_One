package Heaps;

import java.util.HashMap;

public class ArraySubset {
    public boolean isSubset(int a[], int b[]) {
        // a[] = [11, 1, 13, 21, 3, 7, 3], b[] = [11, 3, 7, 1, 7] false
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : a){
            if(!map.containsKey(ele)) map.put(ele,1);
            else{
                int freq = map.get(ele);
                map.put(ele,freq+1);
            }
        }
        for(int ele : b){
            if(!map.containsKey(ele)) return false;
            else{
                int freq = map.get(ele);
                if(freq==1) map.remove(ele);
                else map.put(ele,freq-1);
            }
        }
        return true;
    }
}
