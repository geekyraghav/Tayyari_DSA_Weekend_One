package Heaps;

import java.util.HashMap;

public class MostFrequentElement {
    public int mostFreqEle(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr){
            if(!map.containsKey(ele)) map.put(ele,1);
            else{
                int freq = map.get(ele);
                map.put(ele,freq+1);
            }
        }
        int maxFreq = 1, ans = arr[0];
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(freq>=maxFreq){
                maxFreq = freq;
                ans = key;
            }
        }
        return ans;
    }
}
