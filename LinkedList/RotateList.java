package LinkedList;

public class RotateList {
    public Node rotate(Node head, int k) {
        if(k==0 || head==null || head.next==null) return head;
        int n = 0;
        Node temp = head;
        while(temp!=null){
            n++;
            temp = temp.next;
        }
        k = k%n;
        if(k==0) return head;
        k = n - k; // new line
        Node slow = head;
        Node fast = head;
        for(int i=1;i<=k;i++) fast = fast.next;
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        Node a = slow.next;
        slow.next = null;
        fast.next = head;
        return a;
    }
}
