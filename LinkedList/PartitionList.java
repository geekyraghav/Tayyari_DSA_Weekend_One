package LinkedList;
class ListNode{ // User defined data type
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode d1 = new ListNode(-1);
        ListNode i = d1;
        ListNode d2 = new ListNode(-1);
        ListNode j = d2;
        ListNode k = head;
        while(k!=null){
            if(k.val < x){
                i.next = k;
                i = i.next;
            }
            else{
                j.next = k;
                j = j.next;
            }
            k = k.next;
        }
        i.next = d2.next;
        j.next = null;
        return d1.next;
    }
}
