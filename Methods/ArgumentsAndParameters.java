package Methods;

public class ArgumentsAndParameters {

    public static void main(String[] args) {
        max(4,20,7); // arguments
    }

    public static void max(int a, int b, int c) { // parameters
        if(a>=b && a>=c) System.out.println(a);
        else if(b>=a && b>=c) System.out.println(b);
        else System.out.println(c);
    }
}
