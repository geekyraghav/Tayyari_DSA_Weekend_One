package Conditionals;
import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        if(n%2 == 0) {
            System.out.println("Even Number");
            System.out.println("Badiya");
        }
        else
            System.out.println("Odd Number");
    }
}
