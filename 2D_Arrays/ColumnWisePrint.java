package MultiDimensionalArrays;

public class ColumnWisePrint {
    public static void main(String[] args) {
        int[][] arr = {{6,0,2,7,6},{1,3,7,2,2},{9,9,4,5,2}};
        for(int j=0;j<arr[0].length;j++){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
//        // ERROR
//        for(int i=0;i<arr.length;i++){ // i-> 0 to 2
//            for(int j=0;j<arr[0].length;j++){ // j-> 0 to 4
//                System.out.print(arr[j][i]+" ");
//            }
//            System.out.println();
//        }

    }
}
