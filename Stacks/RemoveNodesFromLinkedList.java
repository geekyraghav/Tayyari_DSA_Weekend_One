package Stacks;
import java.util.Stack;
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val = val;
    }
}
public class RemoveNodesFromLinkedList {
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;
        while(temp!=null){
            while(st.size()>0 && st.peek().val < temp.val) st.pop();
            st.push(temp);
            temp = temp.next;
        }
        ListNode dummy = new ListNode(-1);
        temp = dummy;
        while(st.size()>0){
            ListNode top = st.pop();
            top.next = null; // imp
            temp.next = top;
            temp = top;
        }
        temp = dummy.next;
        dummy.next = null;
        return reverse(temp);
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode nxt = null;
        while(curr!=null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
}
