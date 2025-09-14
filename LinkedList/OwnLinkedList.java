package LinkedList;
class Node{ // User defined data type
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
class MyLinkedList{ // User defined data structure
    private Node head;
    private Node tail;
    private int size;
    void insertAtTail(int ele){ // O(1) Time
        Node n = new Node(ele);
        if(size==0) head = tail = n;
        else{
            tail.next = n;
            tail = n;
        }
        size++;
    }
    void insertAtHead(int ele){ // O(1) Time
        Node n = new Node(ele);
        if(size==0) head = tail = n;
        else{
            n.next = head;
            head = n;
        }
        size++;
    }
    void insert(int idx,int ele) throws Exception{ // O(n) Time
        if(idx<0 || idx>size) throw new Exception("Index out of Bound");
        if(idx==0) insertAtHead(ele);
        else if(idx==size) insertAtTail(ele);
        else{
            Node temp = head;
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            Node n = new Node(ele);
            n.next = temp.next;
            temp.next = n;
            size++;
        }
    }
    void deleteAtHead() throws Exception{ // O(1) Time
        if(size==0) throw new Exception("List is Empty!");
        head = head.next;
        size--;
    }
    void delete(int idx) throws Exception{ // O(n) Time
        if(idx<0 || idx>=size) throw new Exception("Index out of bound");
        Node temp = head;
        for(int i=1;i<=idx-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }
    void display(){ // O(n) Time
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    int size(){ // O(1) Time
        return size;
    }

    public int get(int idx) throws Exception{ // O(n) Time
        if(idx<0 || idx>=size) throw new Exception("Index out of Bound");
        Node temp = head;
        for(int i=1;i<=idx;i++){
            temp = temp.next;
        }
        return temp.data;
    }
    public void set(int idx, int ele) throws Exception{ // O(n) Time
        if(idx<0 || idx>=size) throw new Exception("Index out of Bound");
        Node temp = head;
        for(int i=1;i<=idx;i++){
            temp = temp.next;
        }
        temp.data = ele;
    }
}
public class OwnLinkedList {
    public static void main(String[] args) throws Exception{
        MyLinkedList list = new MyLinkedList();
        // list.deleteAtHead(); will give exception
        list.insertAtTail(10); list.insertAtTail(20); list.insertAtTail(30);
        list.display();
        System.out.println(list.size());
        list.insertAtTail(12); list.insertAtTail(42);
        list.display();
        list.insertAtHead(45); list.insertAtHead(97); list.insertAtTail(6);
        list.display();
        list.deleteAtHead();
        list.display();
        list.insert(4,19);
        list.display();
        System.out.println(list.get(3));
    }
}
