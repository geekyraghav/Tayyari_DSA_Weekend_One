package ArraysAndArrayLists;

import java.util.Scanner;

public class BasicsOfArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {8,7,5,2,-3,25,67}; // 0 to 6
        System.out.println(arr.length);
        // System.out.println(arr[8]); // error
        System.out.println(arr[5]);
        arr[5] = 50; // change
        System.out.println(arr[5]);
        arr[5] = sc.nextInt();
        System.out.println(arr[5]+3);
    }
}
