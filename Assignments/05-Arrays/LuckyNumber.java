package Assignment4;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class LuckyNumber {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>();
    int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
    Integer lucky = null;
    for(int i=0; i<matrix.length; i++){
      for(int j=0; j<matrix[0].length; j++){
        int flag = 0;
        for(int k=0; k<matrix.length; k++){
          if(matrix[i][j]<matrix[k][j]){
            flag = 1;
          }
        }
        for(int l=0; l<matrix[0].length; l++){
          if(matrix[i][j]>matrix[i][l]){
            flag = 1;
          }
        }
        if(flag==0){
          list.add(matrix[i][j]);
        }
      }
    }
    System.out.println(list);
  }

}
