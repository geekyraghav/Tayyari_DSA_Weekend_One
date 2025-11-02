package BinaryTrees;

public class SymmetricTree {
    public boolean isSymmetric(Node root) {
        return helper(root.left,root.right);
    }
    public boolean helper(Node p, Node q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.data!=q.data) return false;
        return helper(p.left,q.right) && helper(p.right,q.left);
    }

    // public boolean isSymmetric(Node root) {
    //     mirror(root.left);
    //     boolean flag = isIdentical(root.left,root.right);
    //     mirror(root.left);
    //     return flag;
    // }
    // public boolean isIdentical(Node p, Node q) {
    //     if(p==null && q==null) return true;
    //     if(p==null || q==null) return false;
    //     if(p.data!=q.data) return false;
    //     return isIdentical(p.left,q.left) && isIdentical(p.right,q.right);
    // }
    // public void mirror(Node root) {
    //     if(root==null) return;
    //     Node temp = root.left;
    //     root.left = root.right;
    //     root.right = temp;
    //     mirror(root.left);
    //     mirror(root.right);
    // }
}
