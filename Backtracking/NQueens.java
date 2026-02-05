package Backtracking;

public class NQueens {
    static int count = 0;
    static void main() {
        int n = 5;
        char[][] board = new char[n][n]; // null character
        placeQueens(0,board);
        System.out.println(count);
    }
    private static void placeQueens(int row, char[][] board) {
        int n = board.length;
        if(row==n){ // print the config
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            count++;
            return;
        }
        for(int j=0;j<n;j++){
            if(canBePlaced(row,j,board)){
                board[row][j] = 'Q';
                placeQueens(row+1,board);
                board[row][j] = '\0'; // backtracking
            }
        }
    }

    private static boolean canBePlaced(int row, int col, char[][] board) {
        int n = board.length;
        int i,j;
        // up
        for(i = row-1,j = col; i>=0; i--){
            if(board[i][j]=='Q') return false;
        }
        // right up
        for(i = row-1,j = col+1;i>=0 && j<n;i--,j++){
            if(board[i][j]=='Q') return false;
        }
        // left up
        for (i = row-1,j = col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q') return false;
        }
        return true;
    }
}
