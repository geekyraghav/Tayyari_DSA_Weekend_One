package BitManipulation;

public class NumberOf1Bits {
    static int setBits(int n) {
        int count = 0;
        while(n!=0){
            n = n&(n-1);
            count++;
        }
        return count;
    }

//    static int setBits(int n) {
//        int count = 0;
//        while(n!=0){
//            count += (n%2);
//            n /= 2;
//        }
//        return count;
//    }

//    static int setBits(int n) {
//        int count = 0;
//        for(int i=0;i<=31;i++){
//            if((n>>i)%2 != 0) count++;
//        }
//        return count;
//    }
}
