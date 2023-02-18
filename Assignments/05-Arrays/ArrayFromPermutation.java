package Assignment4;

import java.util.Arrays;

public class ArrayFromPermutation {

  public static void main(String[] args) {
    int[] nums = {5,0,1,2,3,4};
    int n = nums.length;
    int[] arr = new int[n];
    for(int i=0; i<nums.length; i++){
      arr[i] = nums[nums[i]];
    }
    System.out.println(Arrays.toString(arr));
  }

}
