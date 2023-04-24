package demo.recursionPractice;

import java.util.Arrays;

public class maze4WayBackTracking {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
//        allPath("", board, 0, 0);

        int[][] path = new int[board.length][board[0].length];
        allPathPrint("", board, 0, 0, path, 1);
    }

    //ways printing through backtracking
    static void allPath(String p, boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[1].length-1){
            System.out.println(p);
            return;
        }

        //condition on restriction
        if(!maze[r][c]){
            return;
        }

        //initial backTracking condition
        maze[r][c] = false;

        if(r<maze.length-1){
            allPath(p+'D', maze,r+1, c);
        }
        if(c<maze.length-1){
            allPath(p+'R', maze, r, c+1);
        }
        if(r>0){
            allPath(p+'U', maze,r-1, c);
        }
        if(c>0){
            allPath(p+'L', maze,r, c-1);
        }

        //ending condition
        maze[r][c] = true;
    }

    //ways steps printing through backtracking
    static void allPathPrint(String p, boolean[][] maze, int r, int c, int[][] path, int step){
        if(r==maze.length-1 && c==maze[1].length-1){
            path[r][c] = step;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        //condition on restriction
        if(!maze[r][c]){
            return;
        }

        //initial backTracking condition
        maze[r][c] = false;
        path[r][c] = step;

        if(r<maze.length-1){
            allPathPrint(p+'D', maze,r+1, c, path, step+1);
        }
        if(c<maze.length-1){
            allPathPrint(p+'R', maze, r, c+1, path, step+1);
        }
        if(r>0){
            allPathPrint(p+'U', maze,r-1, c, path, step+1);
        }
        if(c>0){
            allPathPrint(p+'L', maze,r, c-1, path, step+1);
        }

        //ending condition
        maze[r][c] = true;
        path[r][c] = 0;
    }
}
