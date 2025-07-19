package BasicsOfJava;

public class ModifyingVariableValues {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x);
        x = 10;
        System.out.println(x);
        x = x + 7;
        System.out.println(x);
        x = x - 2;
        System.out.println(x);
        x = 100 - x;
        System.out.println(x);
        int y = 20;
        x = x + y;
        System.out.println(x);
        y = -y;
        System.out.println(y);
    }
}
