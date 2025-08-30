package Recursion;
import java.util.Scanner;
public class PrintN {
    static int m;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    public static void print(int n) { // 1 to n
        if(n==0) return; // base case
        print(n-1); // call
        System.out.print(n+" "); // work
    }

//    public static void print(int x, int n) { // 1 to n (2 Parameters)
//        if(x>n) return; // base case
//        System.out.print(x+" "); // work
//        print(x+1,n); // call
//    }

//    public static void print(int n) { // 1 to n (Global variable)
//        if(n>m) return; // base case
//        System.out.print(n+" "); // work
//        print(n+1); // call
//    }

//    public static void print(int n) { // n to 1
//        if(n==0) return; // base case
//        System.out.print(n+" "); // work
//        print(n-1); // call
//    }
}
