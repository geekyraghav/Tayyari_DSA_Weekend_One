package LinkedList;

public class MiddleOfALinkedList {
    int getMiddle(Node head) { // 1 pass solution
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

//    int getMiddle(Node head) { // 2 pass solution
//        Node temp = head;
//        int len = 0;
//        while(temp!=null){
//            temp = temp.next;
//            len++;
//        }
//        temp = head;
//        for(int i=1;i<=len/2;i++){
//            temp = temp.next;
//        }
//        return temp.data;
//    }
}
