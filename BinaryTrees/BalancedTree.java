package BinaryTrees;

public class BalancedTree {
    static boolean flag;
    public boolean isBalanced(Node root) {
        flag = true;
        levels(root);
        return flag;
    }
    private int levels(Node root) {
        if(root==null) return 0;
        int leftLevels = levels(root.left);
        int rightLevels = levels(root.right);
        if(Math.abs(leftLevels-rightLevels)>1) flag = false; // extra
        return 1 + Math.max(leftLevels,rightLevels);
    }

//    public boolean isBalanced(Node root) {
//        if(root==null) return true;
//        int leftLevels = levels(root.left);
//        int rightLevels = levels(root.right);
//        if(Math.abs(leftLevels-rightLevels)>1) return false;
//        return isBalanced(root.left) && isBalanced(root.right);
//    }
//    private int levels(Node root) {
//        if(root==null) return 0;
//        return 1 + Math.max(levels(root.left),levels(root.right));
//    }
}
