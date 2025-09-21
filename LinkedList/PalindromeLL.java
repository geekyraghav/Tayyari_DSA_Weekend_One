package LinkedList;

import java.util.ArrayList;

public class PalindromeLL {
    public boolean isPalindrome(Node head) { // Deep Copy of LL
        // break into 2 lists
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node head2 = slow.next;
        slow.next = null;
        head2 = reverseList(head2);
        Node i = head;
        Node j = head2;
        while(j!=null){
            if(i.data != j.data) return false;
            i = i.next;
            j = j.next;
        }
        return true;
    }
    public Node reverseList(Node head) { // Iterative
        Node prev = null;
        Node curr = head;
        Node nxt = null;
        while(curr!=null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }

//    public boolean isPalindrome(Node head) { // Deep Copy of LL
//        Node duplicate = new Node(-1);
//        Node i = duplicate;
//        Node j = head;
//        while(j!=null){
//            Node temp = new Node(j.data);
//            i.next = temp;
//            i = i.next;
//            j = j.next;
//        }
//        duplicate = duplicate.next;
//        i = reverseList(duplicate);
//        j = head;
//        while(j!=null){
//            if(i.data != j.data) return false;
//            i = i.next;
//            j = j.next;
//        }
//        return true;
//    }
//    public Node reverseList(Node head) { // Iterative
//        Node prev = null;
//        Node curr = head;
//        Node nxt = null;
//        while(curr!=null){
//            nxt = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = nxt;
//        }
//        return prev;
//    }

//    public boolean isPalindrome(Node head) { // using array
//        ArrayList<Integer> arr = new ArrayList<>();
//        Node temp = head;
//        while(temp!=null){
//            arr.add(temp.data);
//            temp = temp.next;
//        }
//        int i = 0, j = arr.size()-1;
//        while(i<j){
//            if(arr.get(i)!=arr.get(j)) return false;
//            i++;
//            j--;
//        }
//        return true;
//    }
}
