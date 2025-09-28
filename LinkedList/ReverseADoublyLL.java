package LinkedList;

public class ReverseADoublyLL {
    public Node reverse(Node head) {
        Node prv = null;
        Node curr = head;
        Node nxt = null;
        while(curr!=null){
            nxt = curr.next;
            curr.next = prv;
            curr.prev = nxt;
            prv = curr;
            curr = nxt;
        }
        return prv;
    }
}
