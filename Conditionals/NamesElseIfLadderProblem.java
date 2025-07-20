package Conditionals;
import java.util.Scanner;
public class NamesElseIfLadderProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        if(n%5 == 0 && n%3 == 0) System.out.println("Aditya");
        else if(n%3 == 0) System.out.println("Arjun");
        else if(n%5 == 0) System.out.println("Tania");
        else System.out.println("Eva");

//        if(n%5 == 0 && n%3 != 0) System.out.println("Tania");
//        if(n%3 == 0 && n%5 != 0) System.out.println("Arjun");
//        if(n%5 == 0 && n%3 == 0) System.out.println("Aditya");
//        if(n%5 != 0 && n%3 != 0) System.out.println("Eva");
    }
}
