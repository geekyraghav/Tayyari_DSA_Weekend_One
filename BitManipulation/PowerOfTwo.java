package BitManipulation;

public class PowerOfTwo {
    public static boolean isPowerofTwo(int n) {
        return (n!=0 && (n&(n-1)) == 0);
    }

    // public static boolean isPowerofTwo(int n) {
    //     if(n==1) return true;
    //     if(n==0 || n%2 == 1) return false;
    //     return isPowerofTwo(n/2);
    // }
}
