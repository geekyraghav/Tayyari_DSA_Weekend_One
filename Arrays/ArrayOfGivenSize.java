package ArraysAndArrayLists;

public class ArrayOfGivenSize {
    public static void main(String[] args) {
        int[] arr = new int[7]; // 0 to 6 index hai
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        char[] c = new char[5];
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
        System.out.println();

        double[] drr = new double[10];
        for(int i=0;i<drr.length;i++){
            System.out.print(drr[i]+" ");
        }
        System.out.println();

        double[] d = {3.14,2.871,9.81};
    }
}
