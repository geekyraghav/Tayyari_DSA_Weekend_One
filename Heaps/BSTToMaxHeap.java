package Heaps;

import java.util.ArrayList;

public class BSTToMaxHeap {
    static int idx;
    public static void convertToMaxHeapUtil(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorder(root,arr);
        idx = 0;
        postorder(root,arr);
    }

    private static void postorder(Node root, ArrayList<Integer> arr) {
        if(root==null) return;
        postorder(root.left,arr);
        postorder(root.right,arr);
        root.data = arr.get(idx++);
    }

    private static void inorder(Node root, ArrayList<Integer> arr) {
        if(root==null) return;
        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
    }
}
