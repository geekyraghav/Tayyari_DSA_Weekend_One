package Stacks;
import java.util.Stack;
public class PushAtBottomRecursive {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10); st.push(20); st.push(30); st.push(40);
        print(st);
        pushAtBottom(50,st);
        print(st);
        reverse(st);
        print(st);
    }

    private static void reverse(Stack<Integer> st) {
        if(st.size()==1) return;
        int top = st.pop();
        reverse(st);
        pushAtBottom(top,st);
    }

    private static void pushAtBottom(int ele, Stack<Integer> st) {
        if(st.size()==0){
            st.push(ele);
            return;
        }
        int top = st.pop();
        pushAtBottom(ele,st);
        st.push(top);
    }

    private static void print(Stack<Integer> st) {
        Stack<Integer> st2 = new Stack<>();
        while(st.size()>0){
            System.out.println(st.peek());
            st2.push(st.pop());
        }
        while(st2.size()>0){
            st.push(st2.pop());
        }
        System.out.println();
    }
}
