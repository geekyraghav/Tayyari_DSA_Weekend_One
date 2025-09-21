package LinkedList;

public class SortList {
    public Node mergeSort(Node head) {
        if(head==null || head.next==null) return head;
        // break into 2 lists
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node head2 = slow.next;
        slow.next = null;
        // magic
        head = mergeSort(head);
        head2 = mergeSort(head2);
        // merge
        return sortedMerge(head,head2);
    }
    public Node sortedMerge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node i = head1;
        Node j = head2;
        Node k = dummy;
        while(i!=null && j!=null){
            if(i.data < j.data){
                k.next = i;
                i = i.next;
            }
            else{
                k.next = j;
                j = j.next;
            }
            k = k.next;
        }
        if(i==null) k.next = j;
        else k.next = i;
        return dummy.next;
    }
}
