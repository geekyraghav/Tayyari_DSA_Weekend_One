package Heaps;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
    public class Triplet implements Comparable<Triplet>{
        int dist;
        int x;
        int y;
        Triplet(int dist, int x, int y){
            this.dist = dist;
            this.x = x;
            this.y = y;
        }
        public int compareTo(Triplet t) {
            return Integer.compare(this.dist,t.dist);
        }
    }
    public ArrayList<ArrayList<Integer>> kClosest(int[][] points, int k) {
        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<points.length;i++){
            int x = points[i][0];
            int y = points[i][1];
            int dist = x*x + y*y;
            pq.add(new Triplet(dist,x,y));
            if(pq.size()>k) pq.remove();
        }
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        while(pq.size()>0){
            Triplet top = pq.remove();
            ArrayList<Integer> a = new ArrayList<>();
            a.add(top.x);
            a.add(top.y);
            ans.add(a);
        }
        return ans;
    }
}
