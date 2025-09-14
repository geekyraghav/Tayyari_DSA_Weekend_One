package LinkedList;

public class NodeClass {
    public static void displayRec(Node head){
        if(head==null) return;
        System.out.print(head.data+" ");
        displayRec(head.next);
    }
    public static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
//        for(Node temp = head;temp!=null;temp = temp.next){
//            System.out.print(temp.data+" ");
//        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(10); // head
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);

        a.next = b; // a ke next me b ka address aa gaya
        b.next = c;
        c.next = d;

        // print(a);
        displayRec(a);
        System.out.println();
        System.out.println(length(a));

        Node temp = a; // temp shallow copy hai a ki
        temp.data = 100;
        System.out.println(a.data);

        temp = b;
        System.out.println(a.data);


//        System.out.println(c.data);
//        System.out.println(b.next.data);
//        System.out.println(a.next.next.next.data);
//
//        System.out.println(a.next.next);
//        System.out.println(b.next);
//        System.out.println(c);

    }

    private static int length(Node head) { // O(n) Time
        int count = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        return count;
    }
}
