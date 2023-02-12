package Assignment4;

import java.util.Arrays;

public class TransposeMatrix {

  public static void main(String[] args) {
    int[][] matrix = {{1,2,3},{4,5,6}};
    int m = matrix.length;
    int n = matrix[0].length;
    int[][] mat = new int[n][m];
    for(int i=0; i<m; i++){
      for(int j=0; j<n; j++){
        mat[j][i] = matrix[i][j];
      }
    }
    System.out.println(Arrays.toString(mat[1]));
  }

}
