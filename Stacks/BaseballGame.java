package Stacks;

import java.util.Stack;

public class BaseballGame {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<operations.length;i++){
            String s = operations[i];
            if(s.equals("C")) st.pop();
            else if(s.equals("D")) st.push(2*st.peek());
            else if(s.equals("+")){
                int top = st.pop();
                int sum = st.peek() + top;
                st.push(top);
                st.push(sum);
            }
            else st.push(Integer.parseInt(s));
        }
        int score = 0;
        while(st.size()>0){
            score += st.pop();
        }
        return score;
    }
}
