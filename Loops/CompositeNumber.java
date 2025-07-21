package Loops;
import java.util.Scanner;
public class CompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        boolean flag = false; // false means prime
        for(int i=2;i<=Math.sqrt(n);i++){ // root n iterations
            if(n%i == 0){ // i is a factor of n
                flag = true; // true means composite
                break;
            }
        }
        if(n==1) System.out.println("Neither Prime nor Composite");
        else if(flag==false) System.out.println("Prime Number");
        else System.out.println("Composite Number");
    }
}
