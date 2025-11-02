package BinaryTrees;

import java.util.ArrayList;

public class InorderTraversal {
    public ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(root,ans);
        return ans;
    }

    public void dfs(Node root, ArrayList<Integer> ans){
        if(root==null) return;
        dfs(root.left,ans);
        ans.add(root.data);
        dfs(root.right,ans);
    }
}
