package BasicsOfJava;
import java.util.Scanner;
public class InputInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int x = sc.nextInt();
        System.out.println("The square of " + x + " is " + x*x);
    }
}
