package Assignment4;

import java.util.Arrays;

public class FlippingImage {

  public static void main(String[] args) {
    int[][] image = {{1,1,0},{1,0,1},{0,0,0}};
    for(int i=0; i<image.length; i++){
      for(int j=0, k=image[i].length-1; j<image[i].length/2; j++,k--){
        int temp = image[i][j];
        image[i][j] = image[i][k];
        image[i][k] = temp;
      }
    }
    for(int i=0; i<image.length; i++){
      for(int j=0; j<image[i].length; j++){
        if(image[i][j]==0) image[i][j]=1;
        else image[i][j]=0;
      }
    }
    System.out.println(Arrays.toString(image[0]));
  }

}
