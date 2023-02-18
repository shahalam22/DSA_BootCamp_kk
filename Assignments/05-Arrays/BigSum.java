package Assignment4;

public class BigSum {

  public static void main(String[] args) {
    int[] nums = {-2,1};
    int sum = 0;
    int max = nums[0];
    for(int i=0; i<nums.length; i++){
      sum += nums[i];
      if(sum>max) max = sum;
      if(sum<0) sum = 0;
    }
    System.out.print(max);
  }

}
