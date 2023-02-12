package Assignment4;

public class DiagonalSum {

  public static void main(String[] args) {
    int[][] mat = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
    int sum = 0;
    for(int i=0, j=mat.length-1; i<mat.length; i++, j--){
      sum = sum + mat[i][i] + mat[i][j];
    }
    if(mat.length%2==1){
      sum = sum - mat[mat.length/2][mat.length/2];
    }
    System.out.println(sum);
  }

}
