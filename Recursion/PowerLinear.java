package Recursion;

import java.util.Scanner;

public class PowerLinear {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int a = sc.nextInt();
        System.out.print("Enter Exponent: ");
        int b = sc.nextInt();
        System.out.println(a+" raised to the power "+b+" is "+power(a,b));
    }

    public static int power(int a, int b) throws Exception{ // TC = O(b)
        if(a==0 && b==0) throw new Exception("Indeterminate Form");
        if(a==1 || a==0) return a;
        if(b==0) return 1;
        return a * power(a,b-1);
    }
}
