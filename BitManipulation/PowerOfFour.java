package BitManipulation;

public class PowerOfFour {
    int isPowerOfFour(long n) {
        return (n!=0 && (n&(n-1)) == 0 && n%3 == 1) ? 1 : 0;
    }

//    boolean isPowerofTwo(long n) {
//        return (n!=0 && (n&(n-1)) == 0);
//    }
//    boolean isPerfectSquare(long n) {
//        long root = (long)(Math.sqrt(n));
//        return (root*root == n);
//    }
//    int isPowerOfFour(long n) {
//        return (isPowerofTwo(n) && isPerfectSquare(n)) ? 1 : 0;
//    }
}
