package ArraysAndArrayLists;
import java.util.Arrays;
public class ShallowAndDeepCopy {
    public static void main(String[] args) {
        int[] a = {4,6,2,7};
        int[] d = new int[a.length];
        for(int i=0;i<a.length;i++){
            d[i] = a[i];
        }
//        int[] c = Arrays.copyOf(a,a.length); // deep copy
//        c[0] = 90;
//        System.out.println(a[0]);
//        int[] b = a; // b is shallow copy of a
//        b[0] = 100; // it will change a
//        System.out.println(a[0]);

    }
}
