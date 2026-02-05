package Backtracking;

import java.util.ArrayList;
import java.util.Collections;

public class RatInAMazeObstacles {
    public ArrayList<String> ratInMaze(int[][] maze) { // OBSTACLES
        ArrayList<String> ans = new ArrayList<>();
        int n = maze.length;
        ways(0,0,n-1,n-1,maze,"",ans);
        Collections.sort(ans);
        return ans;
    }

    private void ways(int row, int col, int x, int y, int[][] maze, String s, ArrayList<String> ans) {
        if(row==x && col==y){
            ans.add(s);
            return;
        }
        if(row<0 || row>x || col<0 || col>y || maze[row][col]<=0) return;
        maze[row][col] = -1;
        ways(row-1,col,x,y,maze,s+'U',ans);
        ways(row,col-1,x,y,maze,s+'L',ans);
        ways(row,col+1,x,y,maze,s+'R',ans);
        ways(row+1,col,x,y,maze,s+'D',ans);
        maze[row][col] = 1; // backtracking
    }
}
