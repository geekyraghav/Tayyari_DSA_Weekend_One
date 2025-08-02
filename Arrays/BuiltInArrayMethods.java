package ArraysAndArrayLists;
import java.util.Arrays;
public class BuiltInArrayMethods {
    public static void main(String[] args) {
        int[] arr = {5,3,7,2,6,6,8,2,2};
        int n = arr.length;
        for(int i=n-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        // Arrays.sort(arr);
        print(arr);
        Arrays.sort(arr,2,8); // sorts from 2 to 6
        print(arr);
        Arrays.fill(arr,10);
        print(arr);
    }

    private static void print(int[] arr) {
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
