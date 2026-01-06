package Graphs;

import java.util.Arrays;

public class CycleDetectionDSU {
    public boolean isCycle(int n, int[][] edges) {
        DSU dsu = new DSU(n);
        for(int[] edge : edges){
            int u = edge[0], v = edge[1];
            if(dsu.groupLeader(u)!=dsu.groupLeader(v))
                dsu.union(u,v);
            else return true;
        }
        return false;
    }
    public class DSU{
        int[] parent;
        private int[] size;
        DSU(int vertices){
            parent = new int[vertices];
            for(int i=0;i<vertices;i++) make(i);
            size = new int[vertices];
            Arrays.fill(size,1);
        }
        void make(int n){
            parent[n] = n;
        }
        int groupLeader(int n){
            if(parent[n]==n) return n;
            return parent[n] = groupLeader(parent[n]);
        }
        void union(int a, int b){
            a = groupLeader(a);
            b = groupLeader(b);
            if(size[a] > size[b]){ // union by size
                parent[b] = a;
                size[a] += size[b];
            }
            else{
                parent[a] = b;
                size[b] += size[a];
            }
        }
    }
}
