package ArraysAndArrayLists;

public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {4,-6,2,7,4,0,23,4,8,-5,-2,3};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
