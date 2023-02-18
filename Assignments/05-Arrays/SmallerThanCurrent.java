package Assignment4;

import java.util.Arrays;

public class SmallerThanCurrent {

  public static void main(String[] args) {
  
    int[] num = {8,1,2,2,3};
    int[] arr = new int[num.length];
    for(int i=0; i<num.length; i++){
      //int count = 0;
      for(int j=0; j<num.length; j++){
        if(num[i]>num[j]){
          arr[i]++;
        }
      }
      //arr[i] = count;
    }
    
    System.out.println(Arrays.toString(arr));

  }

}
