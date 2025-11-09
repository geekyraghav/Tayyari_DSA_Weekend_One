package BST;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
    }
}
public class SearchInBST {
    public boolean search(Node root, int key) {
        if(root==null) return false;
        if(root.data>key) return search(root.left,key);
        else if(root.data<key) return search(root.right,key);
        else return true;
    }
}
