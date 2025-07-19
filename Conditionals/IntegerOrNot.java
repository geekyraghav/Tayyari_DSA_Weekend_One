package Conditionals;

import java.util.Scanner;

public class IntegerOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        double n = sc.nextDouble();
        int x = (int)n; // typecast
        if(n == x) System.out.println("Integer");
        else System.out.println("Not an Integer");
    }
}
