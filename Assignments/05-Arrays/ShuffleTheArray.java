package Assignment4;

import java.util.Arrays;

public class ShuffleTheArray {

  public static void main(String[] args) {
    int[] nums = {0,1,2,3,4,5,6,7};
    int n = 4;
    int i=1, j=nums.length-2;
    int[] arr = new int[nums.length];
    arr[0] = nums[0];
    arr[j+1] = nums[j+1];
    while(i<n){
      arr[j-i] = nums[j];
      arr[i+i] = nums[i];
      i++;
      j--;
    }
    
    System.out.println(Arrays.toString(arr));
  }

}
