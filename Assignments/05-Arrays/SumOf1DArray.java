package Assignment4;

import java.util.Arrays;

public class SumOf1DArray {

  public static void main(String[] args) {
    int[] nums = {1,1,1,1,1,1};
    int n = nums.length;
    for(int i=1; i<n; i++){
      nums[i] = nums[i] + nums[i-1];
    }
    System.out.println(Arrays.toString(nums));
  }

}
