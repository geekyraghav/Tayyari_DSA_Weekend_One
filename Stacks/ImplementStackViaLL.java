package Stacks;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
class MyStack{
    Node head;
    int size;
    void push(int ele){
        Node n = new Node(ele);
        n.next = head;
        head = n;
        size++;
    }

    int pop() throws Exception{
        if(size==0) throw new Exception("Stack is Empty!");
        int top = head.data;
        head = head.next;
        size--;
        return top;
    }

    int peek() throws Exception{
        if(size==0) throw new Exception("Stack is Empty!");
        return head.data;
    }

    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println();
    }
}
public class ImplementStackViaLL {
    public static void main(String[] args) throws Exception{
        MyStack st = new MyStack();
        // st.pop();
        st.push(10); st.push(20); st.push(30); st.push(40);
        st.display();
        st.pop();
        st.display();
    }
}
