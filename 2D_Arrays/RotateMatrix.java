class GFG {
    static void rotate(int arr[][]) {
        // Transpose
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // Reverse Each Row
        for(int i=0;i<arr.length;i++){
            int stCol = 0, endCol = arr[0].length - 1;
            while(stCol<endCol){
                int temp = arr[i][stCol];
                arr[i][stCol] = arr[i][endCol];
                arr[i][endCol] = temp;
                stCol++;
                endCol--;
            }
        }
    }
}
