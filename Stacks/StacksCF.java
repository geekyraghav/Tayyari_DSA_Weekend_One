package Stacks;
import java.util.Stack;
public class StacksCF {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.size());
        st.push(10); st.push(30); st.push(80); st.push(20);
        System.out.println(st.peek()+" "+st.size());
        System.out.println(st.pop());
        System.out.println(st+" "+st.size());
    }
}
