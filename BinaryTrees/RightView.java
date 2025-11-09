package BinaryTrees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RightView {
    private int levels(Node root) {
        if(root==null) return 0;
        return 1 + Math.max(levels(root.left),levels(root.right));
    }
    public ArrayList<Integer> rightView(Node root) {
        int[] arr = new int[levels(root)];
        dfs(root,0,arr);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int ele : arr) ans.add(ele);
        return ans;
    }
    public void dfs(Node root, int level, int[] arr){
        if(root==null) return;
        arr[level] = root.data;
        dfs(root.left,level+1,arr);
        dfs(root.right,level+1,arr);
    }
}
