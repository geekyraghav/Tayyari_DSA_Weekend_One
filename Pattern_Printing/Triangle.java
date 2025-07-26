package PatternPrinting;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
                // System.out.print((2*j-1)+" ");
            }
            System.out.println();
        }
    }
}
