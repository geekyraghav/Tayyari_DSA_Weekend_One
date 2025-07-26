package PatternPrinting;
import java.util.Scanner;
public class BinaryTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(((i+j)%2 == 0) ? "1 " : "0 ");
//                if((i+j)%2 == 0) System.out.print("1 ");
//                else System.out.print("0 ");
//                if((i%2 == 1 && j%2 == 1) || (i%2 == 0 && j%2 == 0))
//                    System.out.print(1+" ");
//                else System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}
