package BinaryTrees;

import java.util.ArrayList;

public class PreorderTraversal {
    public ArrayList<Integer> preOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(root,ans);
        return ans;
    }
    public void dfs(Node root, ArrayList<Integer> ans){
        if(root==null) return;
        ans.add(root.data);
        dfs(root.left,ans);
        dfs(root.right,ans);
    }
}
