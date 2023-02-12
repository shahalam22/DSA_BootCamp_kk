package Assignment4;

import java.util.Arrays;

public class MatrixRotation {

  public static void main(String[] args) {
    int[][] mat = {{0,1},{1,0}};
    int[][] target = {{1,0},{0,1}};
    for(int i=0; i<4; i++){
      if(isEqual(mat, target)) {
        System.out.println("True");
        return;
      }
      else{
        mat = rotate(mat);
      }
    }
    System.out.println("False");
    return;
  }
  
  static int[][] rotate(int[][] a){
    int[][] b = new int[a.length][a[0].length];
    for(int i=0; i<a.length; i++){
      for(int j=0; j<a.length; j++){
        b[j][i] = a[i][j];
      }
    }
    for(int k=0; k<a.length/2; k++){
      int[] temp = b[k];
      b[k] = b[a.length-1-k];
      b[a.length-1-k] = temp;
    }
    return b;
  }
  
  static boolean isEqual(int[][] a, int[][] b){
    if(a.length!=b.length || a[0].length!=b[0].length){
      return false;
    }
    for(int i=0; i<a.length; i++){
      for(int j=0; j<a.length; j++){
        if(a[i][j]!=b[i][j]) return false;
      }
    }
    return true;
  }

}
