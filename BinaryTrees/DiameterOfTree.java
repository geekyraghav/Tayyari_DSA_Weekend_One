package BinaryTrees;

public class DiameterOfTree {
    static int maxDia;
    public int diameter(Node root) {
        maxDia = 0;
        levels(root);
        return maxDia;
    }
    private int levels(Node root) {
        if(root==null) return 0;
        int leftLevels = levels(root.left);
        int rightLevels = levels(root.right);
        maxDia = Math.max(maxDia,leftLevels + rightLevels); // extra
        return 1 + Math.max(leftLevels,rightLevels);
    }

//    static int maxDia;
//    public int diameter(Node root) {
//        maxDia = 0;
//        dfs(root);
//        return maxDia;
//    }
//    public void dfs(Node root) {
//        if(root==null) return;
//        int dia =  levels(root.left) + levels(root.right);
//        maxDia = Math.max(maxDia,dia);
//        dfs(root.left);
//        dfs(root.right);
//    }
//    private int levels(Node root) {
//        if(root==null) return 0;
//        int leftLevels = levels(root.left);
//        int rightLevels = levels(root.right);
//        return 1 + Math.max(leftLevels,rightLevels);
//    }
}
