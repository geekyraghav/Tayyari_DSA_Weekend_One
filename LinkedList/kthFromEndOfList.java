package LinkedList;

public class kthFromEndOfList {
    int getKthFromLast(Node head, int k) { // slow fast solution
        Node fast = head;
        for(int i=1;i<=k;i++){
            if(fast==null) return -1;
            fast = fast.next;
        }
        Node slow = head;
        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }

//    int getKthFromLast(Node head, int k) { // length solution
//        Node temp = head;
//        int len = 0;
//        while(temp!=null){
//            temp = temp.next;
//            len++;
//        }
//        if(k>len) return -1;
//        temp = head;
//        for(int i=1;i<=len-k;i++){
//            temp = temp.next;
//        }
//        return temp.data;
//    }
}
