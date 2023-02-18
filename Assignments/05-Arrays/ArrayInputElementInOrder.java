package Assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayInputElementInOrder {

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>();
    int[] nums = {0,1,2,3,4};
    int[] index = {0,1,2,2,1};
    int[] ans = new int[nums.length];
    for(int i=0; i<nums.length; i++){
      list.add(index[i], nums[i]);
    }
    for(int i=0; i<nums.length; i++){
      ans[i] = list.get(i);
    }
    System.out.println(Arrays.toString(ans));

  }

}
