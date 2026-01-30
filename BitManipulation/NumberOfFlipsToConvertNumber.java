package BitManipulation;

public class NumberOfFlipsToConvertNumber {
    static int setBits(int n) {
        int count = 0;
        while(n!=0){
            n = n&(n-1);
            count++;
        }
        return count;
    }
    public static int countBitsFlip(int a, int b) {
        return setBits(a^b);
    }
}
