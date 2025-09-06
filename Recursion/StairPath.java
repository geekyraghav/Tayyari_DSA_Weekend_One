package Recursion;

public class StairPath {
    int countWays(int n) {
        if(n==1) return 1; // 1
        if(n==2) return 2; // 11 2
        return countWays(n-1) + countWays(n-2);
    }
}
