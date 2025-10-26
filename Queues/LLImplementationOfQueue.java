package Queues;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
class LLQueue{
    private Node head;
    private Node tail;
    private int size;
    int size(){
        return size;
    }
    void add(int ele){
        Node n = new Node(ele);
        if(size==0) head = tail = n;
        else{ // add at tail
            tail.next = n;
            tail = n;
        }
        size++;
    }
    int peek() throws Exception{
        if(size==0) throw new Exception("Queue is Empty!");
        return head.data;
    }
    int remove() throws Exception{
        if(size==0) throw new Exception("Queue is Empty!");
        int peek = head.data;
        head = head.next;
        size--;
        return peek;
    }
    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}
public class LLImplementationOfQueue {
    public static void main(String[] args) throws Exception{
        LLQueue q = new LLQueue();
        // System.out.println(q.peek()); // Exception
        q.add(10); q.add(20); q.add(30); q.add(40);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
    }
}
