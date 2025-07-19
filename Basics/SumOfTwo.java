package BasicsOfJava;
import java.util.Scanner;
public class SumOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        int a = sc.nextInt();
        System.out.print("Enter second Number: ");
        int b = sc.nextInt();
        System.out.println(a + " + " + b + " = " + (a+b));
    }
}
