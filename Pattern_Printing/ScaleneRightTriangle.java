package PatternPrinting;
import java.util.Scanner;
public class ScaleneRightTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
//        int a = 1;
//        for(int i=1;i<=n;i++){
//            for(int j=1;j<=a;j++){
//                System.out.print("*"+" ");
//            }
//            a += 2;
//            System.out.println();
//        }
    }
}
