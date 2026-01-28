package BitManipulation;

public class SetKthBit {
    static int setKthBit(int n, int k) {
        return (n | (1<<k));
    }
}
