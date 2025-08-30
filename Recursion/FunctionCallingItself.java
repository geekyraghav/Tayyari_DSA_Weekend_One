package Recursion;

public class FunctionCallingItself {
    public static void main(String[] args) {
        greet(1);
    }

    public static void greet(int n) {
        if(n==10) return; // base case
        System.out.println("Morning"); // work
        greet(n+1); // call
    }

}
