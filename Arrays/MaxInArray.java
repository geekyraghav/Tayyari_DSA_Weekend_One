package ArraysAndArrayLists;

public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {-4,-6,-2,-7,-4,-23};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
//            if(arr[i]>max) max = arr[i];
            max = Math.max(max,arr[i]);
        }
        System.out.println(max);
//        long x = 5425254545436426l;
//        System.out.println(x);
    }
}
