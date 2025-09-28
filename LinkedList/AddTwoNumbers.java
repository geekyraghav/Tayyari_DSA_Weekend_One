package LinkedList;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        int carry = 0;
        while(t1!=null || t2!=null){
            int sum = ((t1!=null) ? t1.val : 0) + ((t2!=null) ? t2.val : 0) + carry;
            if(sum > 9){
                sum %= 10;
                carry = 1;
            }
            else carry = 0;
            ListNode n = new ListNode(sum);
            t.next = n;
            if(t1!=null) t1 = t1.next;
            if(t2!=null) t2 = t2.next;
            t = t.next;
        }
        if(carry==1){
            ListNode n = new ListNode(1);
            t.next = n;
        }
        return dummy.next;
    }
}
