package Stacks;

import java.util.Stack;

public class CelebrityProblem {
    public int celebrity(int mat[][]) {
        int n = mat.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            st.push(i);
        }
        while(st.size()>1){
            int a = st.pop();
            int b = st.pop();
            // check for a to be celeb
            if(mat[a][b]==0 && mat[b][a]==1) st.push(a);
            // check for b to be celeb
            if(mat[b][a]==0 && mat[a][b]==1) st.push(b);
        }
        if(st.size()==0) return -1;
        int celeb = st.pop();
        // check celeb
        for(int i=0;i<n;i++){
            if(i==celeb) continue;
            if(mat[celeb][i]==1 || mat[i][celeb]==0) return -1;
        }
        return celeb;
    }
//    public int celebrity(int mat[][]) {
//        // mat[i][j] = 1 it means i knows j
//        // mat[j][i] = 0 it means j does not know i
//        for(int i=0;i< mat.length;i++){
//            boolean flag = true; // true means i is celeb
//            for(int j=0;j< mat.length;j++){
//                if(j==i) continue;
//                if(mat[i][j]==1 || mat[j][i]==0){
//                    flag = false;
//                    break;
//                }
//            }
//            if(flag) return i;
//        }
//        return -1;
//    }
}
