package PatternPrinting;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){ // spaces
//                System.out.print(" "+" ");
//            }
//            for(int j=1;j<=n;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
        int nsp = n-1, nst = n;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=nsp;j++){ // spaces
                System.out.print(" "+" ");
            }
            for(int j=1;j<=nst;j++){ // stars
                System.out.print("*"+" ");
            }
            nsp--;
            System.out.println();
        }
    }
}
