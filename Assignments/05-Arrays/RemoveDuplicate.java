package Assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicate {

  public static void main(String[] args) {
  int[] nums = {-1,0,2,2,3,3,3,4,4,4,4};
  List<Integer> list = new ArrayList<Integer>();
  int j=0, count = 0;
  for(int i=j; i<nums.length; i++){
    for(j=i+1; j<nums.length; j++){
      if(nums[i]==nums[j]){
        nums[j]=Integer.MIN_VALUE;
      }
      else{
        break;     
      }
    }
  }
  for(int i=0; i<nums.length; i++){
    if(nums[i]!=Integer.MIN_VALUE) count++;
  }
    for(j=0; j<nums.length; j++){
      if(nums[j]!=Integer.MIN_VALUE){
        list.add(nums[j]);
      }
    }
  int[] ans = new int[count];
  for(int i=0; i<count; i++){
    nums[i] = list.get(i);
  }
  
  System.out.println(list);
  System.out.println(Arrays.toString(nums));
  System.out.println(count);
  }

}
