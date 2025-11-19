package Heaps;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}
public class IsBinaryTreeHeap {
    public boolean isHeap(Node root) {
        return maxHeap(root) && isCBT(root,1,size(root));
    }

    private boolean maxHeap(Node root) {
        if(root==null) return true;
        int leftData = (root.left!=null) ? root.left.data : Integer.MIN_VALUE;
        int rightData = (root.right!=null) ? root.right.data : Integer.MIN_VALUE;
        if(root.data <= leftData || root.data <= rightData) return false;
        return maxHeap(root.left) && maxHeap(root.right);
    }

    private boolean isCBT(Node root, int idx, int size) {
        if(root==null) return true;
        if(idx>size) return false;
        return isCBT(root.left,idx*2,size) && isCBT(root.right,idx*2+1,size);
    }

    private int size(Node root) {
        if(root==null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
}
