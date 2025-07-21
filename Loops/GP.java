package Loops;
import java.util.Scanner;
public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        // 2 6 18 54 ..
        int a = 2, r = 3;
        for(int i=1;i<=n;i++){ // n iterations
            System.out.print(a+" ");
            a *= r;
        }
    }
}
