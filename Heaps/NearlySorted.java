package Heaps;
import java.util.PriorityQueue;
public class NearlySorted {
    public void nearlySorted(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int idx = 0;
        for(int ele : arr){
            pq.add(ele);
            if(pq.size()>k) arr[idx++] = pq.remove();
        }
        while(pq.size()>0) arr[idx++] = pq.remove();
    }
}
