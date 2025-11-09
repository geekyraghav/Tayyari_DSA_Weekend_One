package BST;

public class SortedArrayToBST {
    public Node sortedArrayToBST(int[] arr) {
        return build(arr,0,arr.length-1);
    }
    public Node build(int[] arr, int lo, int hi) {
        if(lo>hi) return null;
        int mid = lo + (hi-lo)/2;
        Node root = new Node(arr[mid]);
        root.left = build(arr,lo,mid-1);
        root.right = build(arr,mid+1,hi);
        return root;
    }
}
