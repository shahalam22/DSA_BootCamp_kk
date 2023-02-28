package Assignment5;

import java.util.Arrays;

public class FairCandy {

  public static void main(String[] args) {
    int[] aliceSizes = {1,1};
    int[] bobSizes = {2,2};
    
    int[] ans = new int[2];
    int a = 0, b = 0;
    
    for(int i=0; i<aliceSizes.length; i++){
      a = a + aliceSizes[i];
    }
    //System.out.println(a);
    for(int j=0; j<bobSizes.length; j++){
      b = b + bobSizes[j];
    }
    //System.out.println(b);
    int x = (b+a)/2;
    //System.out.println(x);
    for(int k=0; k<aliceSizes.length; k++){
      int y = a-aliceSizes[k];
      //System.out.println(y);
      for(int l=0; l<bobSizes.length; l++){
        if(x == (y+bobSizes[l])){
          ans[0] = aliceSizes[k];
          ans[1] = bobSizes[l];
        }
      }
    }
    System.out.println(Arrays.toString(ans));
  }

}
