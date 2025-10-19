package Stacks;

import java.util.Stack;

public class ParenthesesChecker {
    public boolean isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{') st.push(ch);
            else{
                if(st.size()>0 && isSameType(ch,st.peek())) st.pop();
                else return false;
            }
        }
        return (st.size()==0);
    }

    private boolean isSameType(char closing, char opening) {
        if(opening=='(' && closing==')') return true;
        if(opening=='{' && closing=='}') return true;
        if(opening=='[' && closing==']') return true;
        return false;
    }
}
