package Assignment4;

import java.util.Arrays;

public class ConcentrationOfArray {

  public static void main(String[] args) {
    int[] num = {1,2,3,4};
    int n = num.length;
    int[] arr = new int[2*n];
    for(int i=0; i<n; i++){
      arr[i] = num[i];
      arr[i+n] = num[i];
    }
    
    System.out.println(Arrays.toString(arr));
  }

}
