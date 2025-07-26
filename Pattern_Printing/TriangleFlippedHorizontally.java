package PatternPrinting;

import java.util.Scanner;

public class TriangleFlippedHorizontally {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

//        for(int i=1;i<=n;i++){
//            for(int j=i;j<=n;j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }

//        int a = n;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=a;j++){
//                System.out.print("*"+" ");
//            }
//            a--;
//            System.out.println();
//        }
    }
}
