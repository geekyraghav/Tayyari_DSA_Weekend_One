package Methods;

public class ReturnType {
    public static void main(String[] args) {
        System.out.println(sum(4,50,8));
        int x = sum(3,7,2);
        System.out.println(x*x);
    }

    public static int sum(int a, int b, int c) {
        System.out.println("Swadesh");
        return a+b+c;
    }
}
