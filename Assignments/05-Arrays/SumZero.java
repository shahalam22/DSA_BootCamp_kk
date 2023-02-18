package Assignment4;

import java.util.Arrays;

public class SumZero {

  public static void main(String[] args) {
    int n = 4;
    int[] arr = new int[n];
    for(int i=1; i<n; i+=2){
      arr[i] = i;
      arr[i-1] = -i;
    }
    System.out.println(Arrays.toString(arr));
  }

}
