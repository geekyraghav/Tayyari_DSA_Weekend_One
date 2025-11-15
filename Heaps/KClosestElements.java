package Heaps;
import java.util.Collections;
import java.util.PriorityQueue;
public class KClosestElements {
    class Pair implements Comparable<Pair>{
        int ele;
        int diff;
        Pair(int ele, int diff){
            this.ele = ele;
            this.diff = diff;
        }
        public int compareTo(Pair p){
            if(this.diff==p.diff) return Integer.compare(p.ele,this.ele);
            return Integer.compare(this.diff,p.diff);
        }
    }
    int[] printKClosest(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr){
            int diff = Math.abs(x-ele);
            pq.add(new Pair(ele,diff));
            if(pq.size()>k) pq.remove();
        }
        int[] ans = new int[k];
        int idx = 0;
        while(pq.size()>0){
            Pair top = pq.remove();
            ans[idx++] = top.ele;
        }
        return ans;
    }
}
