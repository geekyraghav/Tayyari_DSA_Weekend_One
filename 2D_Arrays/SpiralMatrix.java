package MultiDimensionalArrays;
import java.util.ArrayList;
public class SpiralMatrix {
    public static void main(String[] args) {

    }
    public ArrayList<Integer> spirallyTraverse(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int m = arr.length, n = arr[0].length;
        int firstRow = 0, lastRow = m-1, firstCol = 0, lastCol = n-1;
        int tne = m*n;
        while(ans.size()<tne){
            for(int j=firstCol;j<=lastCol;j++) // right
                ans.add(arr[firstRow][j]);
            firstRow++;
            if(ans.size()==tne) break;
            for(int i=firstRow;i<=lastRow;i++) // down
                ans.add(arr[i][lastCol]);
            lastCol--;
            if(ans.size()==tne) break;
            for(int j=lastCol;j>=firstCol;j--) // left
                ans.add(arr[lastRow][j]);
            lastRow--;
            if(ans.size()==tne) break;
            for(int i=lastRow;i>=firstRow;i--) // up
                ans.add(arr[i][firstCol]);
            firstCol++;
        }
        return ans;
    }
//    public ArrayList<Integer> spirallyTraverse(int[][] arr) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        int m = arr.length, n = arr[0].length;
//        int firstRow = 0, lastRow = m-1, firstCol = 0, lastCol = n-1;
//        while(firstRow<=lastRow && firstCol<=lastCol){
//            for(int j=firstCol;j<=lastCol;j++) // right
//                ans.add(arr[firstRow][j]);
//            firstRow++;
//            if(firstRow>lastRow || firstCol>lastCol) break;
//            for(int i=firstRow;i<=lastRow;i++) // down
//                ans.add(arr[i][lastCol]);
//            lastCol--;
//            if(firstRow>lastRow || firstCol>lastCol) break;
//            for(int j=lastCol;j>=firstCol;j--) // left
//                ans.add(arr[lastRow][j]);
//            lastRow--;
//            if(firstRow>lastRow || firstCol>lastCol) break;
//            for(int i=lastRow;i>=firstRow;i--) // up
//                ans.add(arr[i][firstCol]);
//            firstCol++;
//        }
//        return ans;
//    }
}
