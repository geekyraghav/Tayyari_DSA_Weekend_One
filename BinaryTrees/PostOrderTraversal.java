package BinaryTrees;

import java.util.ArrayList;

public class PostOrderTraversal {
    public ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(root,ans);
        return ans;
    }
    public void dfs(Node root, ArrayList<Integer> ans){
        if(root==null) return;
        dfs(root.left,ans);
        dfs(root.right,ans);
        ans.add(root.data);
    }
}
