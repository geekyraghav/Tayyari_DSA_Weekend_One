package Recursion;
import java.util.Scanner;
public class PowerLogarithmic {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int a = sc.nextInt();
        System.out.print("Enter Exponent: ");
        int b = sc.nextInt();
        System.out.println(a+" raised to the power "+b+" is "+power(a,b));
    }

    public static int power(int a, int b) throws Exception{ // TC = O(logb)
        if(a==0 && b==0) throw new Exception("Indeterminate Form");
        if(a==1 || a==0) return a;
        if(b==0) return 1;
        int pow = power(a,b/2);
        if(b%2 == 0) return pow * pow;
        else return pow * pow * a;
    }
}
