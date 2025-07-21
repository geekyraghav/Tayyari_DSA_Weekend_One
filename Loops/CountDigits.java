package Loops;
import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int count = 0;
        if(n==0) count = 1;
        // int count = (n==0) ? 1 : 0;
        while(n != 0){
            n /= 10;
            count++;
        }
        System.out.println(count);
    }
}
