package Stacks;

import java.util.Stack;

public class RemoveConsecutiveCharacters {
    public String removeConsecutiveCharacter(String s) {
        // aaaabbbccaa -> abca
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(st.size()==0 || ch!=st.peek()) st.push(ch);
        }
        StringBuilder ans = new StringBuilder("");
        while(st.size()>0){
            ans.append(st.pop());
        }
        ans.reverse();
        return ans.toString();
    }

//    public String removeConsecutiveCharacter(String s) {
//        // aaaabbbccaa -> abca
//        int i = 0, j = 0;
//        StringBuilder ans = new StringBuilder("");
//        while(j<s.length()){
//            if(s.charAt(i)==s.charAt(j)) j++;
//            else{
//                ans.append(s.charAt(i));
//                i = j;
//            }
//        }
//        ans.append(s.charAt(i));
//        return ans.toString();
//    }
}
