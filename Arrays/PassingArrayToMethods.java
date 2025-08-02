package ArraysAndArrayLists;

public class PassingArrayToMethods {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
    }

    private static void change(int[] x) {
        x[0] = 100;
    }
}
