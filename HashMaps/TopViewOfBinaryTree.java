package Heaps_And_Hashmaps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
public class TopViewOfBinaryTree {
    public class Pair{
        int idx;
        Node node;
        Pair(int idx, Node node){
            this.idx = idx;
            this.node = node;
        }
    }
    public ArrayList<Integer> topView(Node root) {
        HashMap<Integer,Integer> map = new HashMap<>(); // <idx,val>
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(0,root));
        int left = 0, right = 0;
        while(q.size()>0){
            Pair front = q.remove();
            int idx = front.idx;
            if(idx<left) left = idx;
            if(idx>right) right = idx;
            Node node = front.node;
            if(!map.containsKey(idx)) map.put(idx,node.data);
            if(node.left!=null) q.add(new Pair(idx-1,node.left));
            if(node.right!=null) q.add(new Pair(idx+1,node.right));
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=left;i<=right;i++){
            ans.add(map.get(i));
        }
        return ans;
    }
}
