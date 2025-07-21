package Loops;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int a = sc.nextInt();
        System.out.print("Enter exponent: ");
        int b = sc.nextInt();

        boolean bIsNeg = false;
        if(b<0){
            bIsNeg = true;
            b = -b;
        }
        double pow = 1;
        for(int i=1;i<=b;i++){
            if(a<=1) break;
            pow *= a;
        }
        if(bIsNeg==true) pow = 1/pow;
        if(a==0 && b==0) System.out.println("Not Defined");
        else System.out.println(pow);
    }
}
