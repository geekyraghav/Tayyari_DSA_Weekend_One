package ArraysAndArrayLists;

public class ArrayOutput {
    public static void main(String[] args) {
        int[] arr = {8,7,5,2,-3,56,34,-4,-2}; // idx -> 0 to arr.length-1
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0) System.out.print(arr[i]+" ");
        }
    }
}
