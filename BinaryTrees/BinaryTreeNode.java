package BinaryTrees;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}
public class BinaryTreeNode {
    public static void main(String[] args) {
        Node a = new Node(-3); // root
        Node b = new Node(-5);
        Node c = new Node(-2);
        Node d = new Node(-7);
        Node e = new Node(-1);
        Node f = new Node(-6);
        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        print(a);
        System.out.println();
        System.out.println(size(a));
        System.out.println(sum(a));
        System.out.println(max(a));
        System.out.println(levels(a));
//        System.out.println(a.data);
//        System.out.println(a.left.data); // b
//        System.out.println(a.right.data); // c
//        System.out.println(a.left.left.data); // d
//        System.out.println(a.left.right.data); // e
//        System.out.println(a.right.right.data); // f
    }

    private static int size(Node root) {
        if(root==null) return 0;
        return 1 + size(root.left) + size(root.right);
    }
    private static int sum(Node root) {
        if(root==null) return 0;
        return root.data + sum(root.left) + sum(root.right);
    }
    private static int max(Node root) {
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.data, Math.max(max(root.left),max(root.right)));
    }
    private static int levels(Node root) {
        if(root==null) return 0;
        return 1 + Math.max(levels(root.left),levels(root.right));
    }

    private static void print(Node root) {
        if(root==null) return;
        System.out.print(root.data+" ");
        print(root.left);
        print(root.right);
    }
}
