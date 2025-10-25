package Stacks;
import java.util.ArrayList;
import java.util.Stack;
public class StockSpanProblem {
    public ArrayList<Integer> calculateSpan(int[] arr) {
        int n = arr.length;
        int[] pge = new int[n];
        pge[0] = -1;
        Stack<Integer> st = new Stack<>(); // arr ke elements ke indices
        st.push(0);
        for(int i=1;i<n;i++){
            while(st.size()>0 && arr[st.peek()]<=arr[i]) st.pop();
            if(st.size()==0) pge[i] = -1;
            else pge[i] = arr[st.peek()];
            st.push(i);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(i-pge[i]); // span
        }
        return ans;
    }
}
