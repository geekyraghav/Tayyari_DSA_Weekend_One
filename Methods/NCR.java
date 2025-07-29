package Methods;
import java.util.Scanner;
public class NCR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();

        int ncr = fact(n) / (fact(r) * fact(n-r));
        System.out.println(ncr);
    }
    public static int fact(int x){
        int f = 1;
        for(int i=2;i<=x;i++){
            f *= i;
        }
        return f;
    }
}
