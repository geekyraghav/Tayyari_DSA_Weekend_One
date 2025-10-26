package Queues;
import java.util.LinkedList;
import java.util.Queue;
public class TraversingAQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10); q.add(30); q.add(80); q.add(20); q.add(40);
        int n = q.size();
        int sum = 0;
        for(int i=1;i<=n;i++){
            // System.out.print(q.peek()+" ");
            sum += q.peek();
            q.add(q.remove()); // remove and add
        }
        System.out.println(sum);
    }
}
