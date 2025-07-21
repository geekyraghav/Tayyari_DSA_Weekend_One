package Loops;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

//        int fact = 1;
//        for(int i=2;i<=n;i++){
//            fact *= i;
//        }
        int fact = n;
        for(int i=n-1;i>=1;i--){
            fact *= i;
        }
        System.out.println(fact);
    }
}
