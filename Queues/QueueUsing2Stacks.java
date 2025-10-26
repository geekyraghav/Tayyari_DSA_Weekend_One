package Queues;

import java.util.Stack;
class MyQueue { // remove/pop and peek efficient approach
    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();

    public void push(int x) { // push at bottom
        while(st.size()>0){
            helper.push(st.pop());
        }
        st.push(x);
        while(helper.size()>0){
            st.push(helper.pop());
        }
    }

    public int pop() {
        int peek = st.pop();
        return peek;
    }

    public int peek() {
        return st.peek();
    }

    public boolean empty() {
        return (st.size()==0);
    }
}

//class MyQueue { // add/push efficient approach
//    Stack<Integer> st = new Stack<>();
//    Stack<Integer> helper = new Stack<>();
//
//    public void push(int x) {
//        st.push(x);
//    }
//
//    public int pop() { // bottom element remove and return
//        while(st.size()>1){
//            helper.push(st.pop());
//        }
//        int peek = st.pop();
//        while(helper.size()>0){
//            st.push(helper.pop());
//        }
//        return peek;
//    }
//
//    public int peek() {
//        while(st.size()>1){
//            helper.push(st.pop());
//        }
//        int peek = st.peek();
//        while(helper.size()>0){
//            st.push(helper.pop());
//        }
//        return peek;
//    }
//
//    public boolean empty() {
//        return (st.size()==0);
//    }
//}
public class QueueUsing2Stacks {

}
