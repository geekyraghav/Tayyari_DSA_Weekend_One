package Recursion;

import java.util.ArrayList;

public class GenerateParentheses {
    public ArrayList<String> generateParentheses(int n) {
        ArrayList<String> ans = new ArrayList<>();
        generate("",0,0,n,ans);
        return ans;
    }

    private void generate(String s, int left, int right, int n, ArrayList<String> ans) {
        if(left+right == n){
            ans.add(s);
            return;
        }
        if(left < n/2) generate(s+"(",left+1,right,n,ans);
        if(right < left) generate(s+")",left,right+1,n,ans);
    }
}
