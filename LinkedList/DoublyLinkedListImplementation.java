package LinkedList;
class Node{ // User defined data type
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
    }
}
class DoublyLinkedList{
    Node head;
    Node tail;
    int size;
    void insertAtHead(int val){
        Node n = new Node(val);
        if(size==0) head = tail = n;
        else{
            n.next = head;
            head.prev = n;
            head = n;
        }
        size++;
    }
    void insertAtTail(int val){
        Node n = new Node(val);
        if(size==0) head = tail = n;
        else{
            tail.next = n;
            n.prev = tail;
            tail = n;
        }
        size++;
    }
    void insert(int idx, int val) throws Exception{
        if(idx<0 || idx>size) throw new Exception("Index out of Bound");
        else if(idx==0) insertAtHead(val);
        else if(idx==size) insertAtTail(val);
        else{
            Node n = new Node(val);
            Node temp = head;
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            n.next = temp.next;
            temp.next.prev = n;
            temp.next = n;
            n.prev = temp;
            size++;
        }
    }
    int get(int idx) throws Exception{
        if(idx<0 || idx>=size) throw new Exception("Index out of Bound");
        else if(idx==size-1) return tail.data;
        else{
            Node temp;
            if(idx<=size/2){
                temp = head;
                for(int i=1;i<=idx;i++){
                    temp = temp.next;
                }
            }
            else{
                temp = tail;
                for(int i=1;i<=size-idx-1;i++){
                    temp = temp.prev;
                }
            }
            return temp.data;
        }
    }
    void deleteAtHead() throws Exception{
        if(size==0) throw new Exception("List is Empty!");
        head = head.next;
        if(head!=null) head.prev = null;
        size--;
    }
    void deleteAtTail() throws Exception{
        if(size==0) throw new Exception("List is Empty!");
        tail = tail.prev;
        if(tail!=null) tail.next = null;
        size--;
    }
    void delete(int idx) throws Exception{
        if(idx<0 || idx>=size) throw new Exception("Index out of Bound");
        else if(idx==0) deleteAtHead();
        else if(idx==size-1) deleteAtTail();
        else{
            // Homework
        }
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void displayReverse(){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
}
public class DoublyLinkedListImplementation {
    public static void main(String[] args) throws Exception{
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtTail(1); list.insertAtTail(2); list.insertAtTail(3);
        list.insertAtHead(4); list.insertAtHead(5);
        list.display(); list.displayReverse();
    }
}
