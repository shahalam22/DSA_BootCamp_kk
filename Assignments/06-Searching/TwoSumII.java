package Assignment5;

import java.util.Arrays;

public class TwoSumII {

  public static void main(String[] args) {
    int[] numbers = {1,2,3,4,5};
    int target = 6;
    int[] ans = new int[2];
    int high = numbers.length-1;
    int low = 0;
    while(low<high){
      if(numbers[low]+numbers[high]==target){
        ans[0] = low+1;
        ans[1] = high+1;
        System.out.println(Arrays.toString(ans));
        return;
      }
      else if(numbers[low]+numbers[high]>target){
        high--;
      }
      else{
        low++;
      }
    }
  }

}
