package BinaryTrees;
import java.util.ArrayList;
public class FlattenBinaryTreeToLL {
    public static void flatten(Node root) {
        if(root==null) return;
        Node lst = root.left;
        Node rst = root.right;
        flatten(lst);
        flatten(rst);
        root.right = lst;
        root.left = null;
        Node temp = root; // lst can be null
        while(temp.right!=null) temp = temp.right;
        temp.right = rst;
    }

//    public static void flatten(Node root) {
//        ArrayList<Node> pre = new ArrayList<>();
//        dfs(root,pre);
//        for(int i=0;i<pre.size()-1;i++){
//            pre.get(i).left = null;
//            pre.get(i).right = pre.get(i+1);
//        }
//    }
//    public static void dfs(Node root, ArrayList<Node> pre){
//        if(root==null) return;
//        pre.add(root);
//        dfs(root.left,pre);
//        dfs(root.right,pre);
//    }
}
