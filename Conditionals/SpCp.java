package Conditionals;
import java.util.Scanner;
public class SpCp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price: ");
        int cp = sc.nextInt();
        System.out.print("Enter Selling Price: ");
        int sp = sc.nextInt();

        if(sp > cp) System.out.println("Profit is "+(sp-cp));
        else if (sp < cp) System.out.println("Loss is "+(cp-sp));
        else System.out.println("No Profit no Loss");

//        if(sp > cp) System.out.println("Profit");
//        else {
//            if (sp < cp) System.out.println("Loss");
//            else System.out.println("No Profit no Loss");
//        }
    }
}
