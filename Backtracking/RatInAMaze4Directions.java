package Backtracking;

public class RatInAMaze4Directions {
    static void main() {
        int m = 3, n = 3;
        boolean[][] isVisited = new boolean[m][n];
        ways(0,0,m-1,n-1,isVisited,"");
    }

    static void ways(int row, int col, int x, int y, boolean[][] isVisited, String s) {
        if(row==x && col==y){
            System.out.println(s);
            return;
        }
        if(row<0 || row>x || col<0 || col>y || isVisited[row][col]) return;
        isVisited[row][col] = true;
        ways(row-1,col,x,y,isVisited,s+'U');
        ways(row,col-1,x,y,isVisited,s+'L');
        ways(row,col+1,x,y,isVisited,s+'R');
        ways(row+1,col,x,y,isVisited,s+'D');
        isVisited[row][col] = false; // backtracking
    }
}
