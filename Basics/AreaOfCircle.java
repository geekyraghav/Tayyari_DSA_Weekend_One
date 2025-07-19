package BasicsOfJava;
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble();
        double pi = 3.141592;
        double area = pi*radius*radius;
        System.out.println(area);
    }
}
