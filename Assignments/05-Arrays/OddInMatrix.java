package Assignment4;

import java.util.Arrays;

public class OddInMatrix {

  public static void main(String[] args) {
    int m = 2, n = 3;
    int[][] indices = {{0,1},{1,1},{0,2}};
    int[][] matrix = new int[m][n];
    int row = indices.length;
    for(int i=0; i<row; i++){
      int x = indices[i][0];
      for(int j=0; j<n; j++){
        matrix[x][j] += 1;
      }
      x = indices[i][1];
      for(int k=0; k<m; k++){
        matrix[k][x] += 1;
      }
    }
    int count=0;
    for(int i=0; i<m; i++){
      for(int j=0; j<n; j++){
        if(matrix[i][j]%2==1) count++;
      }
    }
    System.out.println(count);
  }

}
