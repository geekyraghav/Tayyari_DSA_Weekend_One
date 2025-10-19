package Stacks;
import java.util.Stack;
public class StackTraversal {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.push("Aditya"); st.push("Saksham");
        st.push("Gokul"); st.push("Ishika");
        st.push("Tanmoy"); st.push("Prajwal");

        Stack<String> st2 = new Stack<>();
        while(st.size()>0){
            // System.out.println(st.peek());
            st2.push(st.pop());
        }
        while(st2.size()>0){
            System.out.println(st2.peek());
            st.push(st2.pop());
        }
    }
}
