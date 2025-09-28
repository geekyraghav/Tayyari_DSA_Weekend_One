package LinkedList;

public class CloneALLWithRandom {
    public Node cloneLinkedList(Node head1) {
        // deep copy
        Node dummy = new Node(-1);
        Node t = dummy;
        Node t1 = head1;
        while(t1!=null){
            Node n = new Node(t1.data);
            t.next = n;
            t = t.next;
            t1 = t1.next;
        }
        Node head2 = dummy.next;

        // Merging Lists Alternatively into 1 list
        t1 = head1;
        Node t2 = head2;
        t = dummy;
        while(t1!=null && t2!=null){
            t.next = t1;
            t1 = t1.next;
            t = t.next;

            t.next = t2;
            t2 = t2.next;
            t = t.next;
        }

        // Assign Random Pointers
        t1 = head1;
        t2 = head2;
        while(t1!=null && t2!=null){
            if(t1.random!=null) t2.random = t1.random.next;
            if(t2!=null) t1 = t2.next;
            if(t1!=null) t2 = t1.next;
        }

        // Splitting LL into 2
        t = head1; // t represent the merged list
        Node d1 = new Node(-1);
        t1 = d1;
        Node d2 = new Node(-1);
        t2 = d2;
        while(t!=null){
            t1.next = t;
            t1 = t1.next;
            t = t.next;

            t2.next = t;
            t2 = t2.next;
            t = t.next;
        }
        t1.next = null;
        return head2;
    }
}
