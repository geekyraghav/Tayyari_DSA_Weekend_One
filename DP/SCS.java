package DP;

import java.util.HashSet;

public class SCS {
    public String shortestCommonSupersequence(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        int i = m, j = n;
        StringBuilder lcs = new StringBuilder("");
        while(i>0 && j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                lcs.append(s1.charAt(i-1));
                i--;
                j--;
            }
            else{
                if(dp[i-1][j] > dp[i][j-1]) i--;
                else j--;
            }
        }
        lcs.reverse();
        StringBuilder scs = new StringBuilder("");
        i = 0; j = 0;
        for(int k=0;k<lcs.length();k++){
            char ch = lcs.charAt(k);
            while(s1.charAt(i)!=ch){
                scs.append(s1.charAt(i));
                i++;
            }
            i++;
            while(s2.charAt(j)!=ch){
                scs.append(s2.charAt(j));
                j++;
            }
            j++;
            scs.append(ch);
        }
        while(i<s1.length()){
            scs.append(s1.charAt(i));
            i++;
        }
        while(j<s2.length()){
            scs.append(s2.charAt(j));
            j++;
        }
        return scs.toString();
    }
}
