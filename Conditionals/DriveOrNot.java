package Conditionals;
import java.util.Scanner;
public class DriveOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18) System.out.println("you can drive");
        else System.out.println("you can't drive");
    }
}
