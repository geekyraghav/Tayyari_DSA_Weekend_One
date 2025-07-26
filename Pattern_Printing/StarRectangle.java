package PatternPrinting;

import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int m = sc.nextInt();
        System.out.print("Enter cols: ");
        int n = sc.nextInt();
        for(int i=1;i<=m;i++){ // lines or rows
            for(int j=1;j<=n;j++){ // stars in each line or cols
                System.out.print("* ");
            }
            System.out.println(); // enter
        }
    }
}
