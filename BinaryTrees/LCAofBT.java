package BinaryTrees;

import java.util.ArrayList;

public class LCAofBT {
    Node lca(Node root, int n1, int n2) {
        if(root.data==n1 || root.data==n2) return root;
        ArrayList<Node> arr = new ArrayList<>();
        ArrayList<Node> a1 = new ArrayList<>();
        ArrayList<Node> a2 = new ArrayList<>();
        dfs(root,n1,n2,arr,a1,a2);
        int i=0;
        while(a1.get(i).data==a2.get(i).data) i++;
        return a1.get(i-1);
    }

    private void dfs(Node root, int n1, int n2, ArrayList<Node> arr, ArrayList<Node> a1, ArrayList<Node> a2) {
        if(root==null) return;
        arr.add(root);
        if(root.data==n1) a1.addAll(new ArrayList<>(arr)); // deep copy
        if(root.data==n2) for(Node ele : arr) a2.add(ele); // deep copy
        dfs(root.left,n1,n2,arr,a1,a2);
        dfs(root.right,n1,n2,arr,a1,a2);
        arr.remove(arr.size()-1); // Backtracking
    }


//    Node lca(Node root, int n1, int n2) {
//        if(root.data==n1 || root.data==n2) return root;
//        boolean f1 = contains(root.left,n1);
//        boolean f2 = contains(root.right,n2);
//        if(f1 && !f2) return lca(root.left,n1,n2);
//        if(!f1 && f2) return lca(root.right,n1,n2);
//        return root;
//    }
//
//    boolean contains(Node root, int val) {
//        if(root==null) return false;
//        if(root.data==val) return true;
//        return contains(root.left,val) || contains(root.right,val);
//    }
}
