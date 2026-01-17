package DP;

import java.util.HashSet;

public class PrintLCS {
    static void main() {
        String s1 = "talent";
        String s2 = "lantern";
        int m = s1.length(), n = s2.length();
        int[][] dp = new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
//        HashSet<String> set = new HashSet<>();
//        printAllLcs(m,n,s1,s2,dp,"",set);
//        for(String s : set) System.out.println(s);
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
        System.out.printf(lcs.toString());
    }

    private static void printAllLcs(int i, int j, String s1, String s2, int[][] dp, String lcs, HashSet<String> set) {
        if(i==0 || j==0){
            StringBuilder sb = new StringBuilder(lcs);
            sb.reverse();
            set.add(sb.toString());
            return;
        }
        if(s1.charAt(i-1)==s2.charAt(j-1)) printAllLcs(i-1,j-1,s1,s2,dp,lcs+s1.charAt(i-1),set);
        else{
            if(dp[i-1][j] >= dp[i][j-1]) printAllLcs(i-1,j,s1,s2,dp,lcs,set);
            if(dp[i][j-1] >= dp[i-1][j]) printAllLcs(i,j-1,s1,s2,dp,lcs,set);
        }
    }
}
