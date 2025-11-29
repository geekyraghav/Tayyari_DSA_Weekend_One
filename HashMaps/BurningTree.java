package Heaps_And_Hashmaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BurningTree {
    public class Pair{
        Node node;
        int time;
        Pair(Node node, int time){
            this.node = node;
            this.time = time;
        }
    }
    static Node start;
    public int minTime(Node root, int target) {
        HashMap<Node,Node> parent = new HashMap<>(); // <child,parent>
        dfs(root,target,parent); // parent mapping and target node
        HashSet<Node> burned = new HashSet<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(start,0));
        burned.add(start);
        int t = 0;
        while(q.size()>0){
            Pair front = q.remove();
            Node node  = front.node;
            int time = front.time;
            t = time;
            if(node.left!=null && !burned.contains(node.left)){
                q.add(new Pair(node.left,time+1));
                burned.add(node.left);
            }
            if(node.right!=null && !burned.contains(node.right)){
                q.add(new Pair(node.right,time+1));
                burned.add(node.right);
            }
            if(parent.containsKey(node) && !burned.contains(parent.get(node))){
                q.add(new Pair(parent.get(node),time+1));
                burned.add(parent.get(node));
            }
        }
        return t;
    }

    private void dfs(Node root, int target, HashMap<Node,Node> parent) {
        if(root==null) return;
        if(root.data == target) start = root;
        if(root.left!=null) parent.put(root.left,root);
        if(root.right!=null) parent.put(root.right,root);
        dfs(root.left,target,parent);
        dfs(root.right,target,parent);
    }
}
