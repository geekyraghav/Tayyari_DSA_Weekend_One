package Stacks;

import java.util.Stack;
class SpecialStack {
    Stack<Integer> st = new Stack<>();
    int min = -1;

    public void push(int ele) {
        if(st.size()==0){
            st.push(ele);
            min = ele;
        }
        else if(ele>=min) st.push(ele);
        else{ // push a fake value
            st.push(2*ele-min);
            min = ele;
        }
    }

    public void pop() {
        if(st.peek()<min) // kucch to gadbad hai (min revert karo)
            min = 2*min - st.peek();
        st.pop();
    }

    public int peek() {
        if(st.size()==0) return -1;
        if(st.peek()<min) return min;
        else return st.peek();
    }

    boolean isEmpty() {
        return (st.size()==0);
    }

    public int getMin() {
        return (st.size()>0) ? min : -1;
    }
}
//class SpecialStack {
//    Stack<Integer> st = new Stack<>();
//    Stack<Integer> min = new Stack<>();
//    public SpecialStack() {
//        // Define Stack
//    }
//
//    public void push(int x) {
//        st.push(x);
//        if(min.size()==0 || x<min.peek()) min.push(x);
//        else min.push(min.peek());
//    }
//
//    public void pop() {
//        st.pop();
//        min.pop();
//    }
//
//    public int peek() {
//        return (st.size()>0) ? st.peek() : -1;
//    }
//
//    boolean isEmpty() {
//        return (st.size()==0);
//    }
//
//    public int getMin() {
//        return (st.size()>0) ? min.peek() : -1;
//    }
//}
public class MinStack {

}
