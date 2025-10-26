package Queues;

import java.util.LinkedList;
import java.util.Queue;
class MyStack { // pop and peek efficient approach
    Queue<Integer> q = new LinkedList<>();

    public void push(int x) { // push at front
        q.add(x);
        int n = q.size();
        for(int i=1;i<=n-1;i++){
            q.add(q.remove());
        }
    }

    public int pop() {
        return q.remove();
    }

    public int top() { // peek
        return q.peek();
    }

    public boolean empty() {
        return (q.size()==0);
    }
}

//class MyStack { // push efficient approach
//    Queue<Integer> q = new LinkedList<>();
//
//    public void push(int x) {
//        q.add(x);
//    }
//
//    public int pop() {
//        int n = q.size();
//        for(int i=1;i<=n-1;i++){
//            q.add(q.remove());
//        }
//        return q.remove();
//    }
//
//    public int top() { // peek
//        int n = q.size();
//        for(int i=1;i<=n-1;i++){
//            q.add(q.remove());
//        }
//        int peek = q.peek();
//        q.add(q.remove());
//        return peek;
//    }
//
//    public boolean empty() {
//        return (q.size()==0);
//    }
//}
public class StackUsingQueue {

}
