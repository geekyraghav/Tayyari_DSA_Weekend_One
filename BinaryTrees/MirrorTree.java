package BinaryTrees;

public class MirrorTree {
    void mirror(Node root) {
        if(root==null) return;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }
}
