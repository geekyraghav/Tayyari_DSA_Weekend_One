package LinkedList;

public class ReversePartOfLL {
    public static Node reverseBetween(int l, int r, Node head) {
        Node dummy = new Node(-1);
        dummy.next = head;
        Node a = null;
        Node b = null;
        Node c = null;
        Node d = null;
        Node temp = dummy;
        for(int i=0;i<r+1;i++){
            if(i==l-1) a = temp;
            if(i==l) b = temp;
            if(i==r) c = temp;
            if(i==r+1) d = temp;
            temp = temp.next;
        }
        a.next = null;
        c.next = null;
        // dummy to a     b to c     d to null
        // reverse b to c
        reverseList(b);
        a.next = c;
        b.next = d;
        return dummy.next;
    }
    public static Node reverseList(Node head) { // Iterative
        Node prev = null;
        Node curr = head;
        Node nxt = null;
        while(curr!=null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
}
