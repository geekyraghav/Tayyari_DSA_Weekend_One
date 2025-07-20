package Loops;
import java.util.Scanner;
public class OneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

//        for(int i=1;i<=n;i++){ // n iterations
//            System.out.print(i+" ");
//        }

        for(int i=n;i>=1;i--){ // n iterations
            System.out.print(i+" ");
        }
    }
}
