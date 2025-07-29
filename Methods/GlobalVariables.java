package Methods;

public class GlobalVariables {
    static int x; // default value = 0
    public static void main(String[] args) {
        System.out.println(x);
        int x = 10;
        change();
        System.out.println(x);
    }
    public static void change() {
        x = 8;
    }
}
