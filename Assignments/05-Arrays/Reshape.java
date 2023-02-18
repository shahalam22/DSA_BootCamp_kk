package Assignment4;

import java.util.Arrays;

public class Reshape {

  public static void main(String[] args) {
    int[][] mat = {{1,2}};
    int r = 2;
    int c = 1;
    int[] x = new int[r*c];
    int[][] ret = new int[r][c];
    
    for(int i=0; i<mat.length; i++){
      for(int j=0; j<mat[0].length; j++){
        x[mat[0].length*i + j] = mat[i][j];
      }
    }
    //System.out.println(x[2]);
    for(int i=0; i<r; i++){
      for(int j=0; j<c; j++){
        ret[i][j] = x[(c*i) + j];        
        //System.out.println(x[c*i + j]);
      }
    }
    System.out.println(Arrays.toString(ret[1]));
  }

}
