package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

class MedianFinder {
    PriorityQueue<Integer> minheap = new PriorityQueue<>();
    PriorityQueue<Integer> maxheap = new PriorityQueue<>(Collections.reverseOrder());

    public void addNum(int ele) {
        if(maxheap.size()==0 || ele<=maxheap.peek()) maxheap.add(ele);
        else minheap.add(ele);

        if(maxheap.size() - minheap.size() > 1) minheap.add(maxheap.remove());
        if(minheap.size() - maxheap.size() > 1) maxheap.add(minheap.remove());
    }

    public double findMedian() {
        if(maxheap.size()>minheap.size()) return maxheap.peek();
        else if(minheap.size()>maxheap.size()) return minheap.peek();
        else return (maxheap.peek() + minheap.peek())/2.0;
    }
}
public class FindMedianInDataStream {

}
