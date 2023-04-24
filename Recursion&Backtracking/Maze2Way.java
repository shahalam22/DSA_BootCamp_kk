package demo.recursionPractice;

public class Maze2Way {
    public static void main(String[] args) {
//        System.out.println(maze(3,3));
//        pathDiagonal("", 3,3);  

        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathRestriction("", board, 0, 0);
    }

    //program to find the number of ways we could reach to [1,1] from [r,c].
    static int maze(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int left = maze(r-1, c);
        int right = maze(r, c-1);

        return left + right;
    }

    //program to find the ways we could reach to [1,1] from [r,c]
    static void mazePath(String way, int r, int c){
        if(c==1){
            for(int i=0; i<r-1; i++){
                way = way + 'D';
            }
            System.out.println(way);
            return;
        }
        if(r==1){
            for(int i=0; i<c-1; i++){
                way = way + 'R';
            }
            System.out.println(way);
            return;
        }
        mazePath(way+'D', r-1, c);
        mazePath(way+'R', r, c-1);
    }

    /*kunal did this

    static void path(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+'D', r-1, c);
        }
        if(c>1){
            path(p+'R', r, c-1);
        }
    }

    */

    /* doing this using ArrayList

    static ArrayList<String> pathRet(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(r>1){
            list.addAll(pathRet(p+'D', r-1, c));
        }
        if(c>1){
            list.addAll(pathRet(p+'R', r, c-1));
        }
        return list;
    }

    */

    //here is the code that how will our paths will be if we could go diagonally along with right and down.
    static void pathDiagonal(String p, int r, int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            pathDiagonal(p+'D', r-1, c);
        }
        if(c>1){
            pathDiagonal(p+'R', r, c-1);
        }
        if(r>1 && c>1){
            pathDiagonal(p+'d', r-1, c-1);
        }
    }

    //if we have any constrains in the matrix (i.g. [2,2] index can't be accessed), then follow below code
    static void pathRestriction(String p, boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[1].length-1){
            System.out.println(p);
            return;
        }

        //condition on restriction
        if(!maze[r][c]){
            return;
        }

        if(r<maze.length-1){
            pathRestriction(p+'D', maze,r+1, c);
        }
        if(c<maze.length-1){
            pathRestriction(p+'R', maze, r, c+1);
        }
    }
}
