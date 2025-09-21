package LinkedList;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode d1 = new ListNode(-1);
        ListNode i = d1;
        ListNode d2 = new ListNode(-1);
        ListNode j = d2;
        ListNode k = head;
        int idx = 1;
        while(k!=null){
            if(idx%2 == 1){
                i.next = k;
                i = i.next;
            }
            else{
                j.next = k;
                j = j.next;
            }
            k = k.next;
            idx++;
        }
        i.next = null;
        j.next = null;
        i = d2.next;
        j = d1.next;
        ListNode d = new ListNode(-1);
        k = d;
        while(i!=null && j!=null){
            k.next = i;
            i = i.next;
            k = k.next;
            k.next = j;
            j = j.next;
            k = k.next;
        }
        return d.next;
    }
}
