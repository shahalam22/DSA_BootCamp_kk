package Assignment4;

public class TwoSum {

  public static void main(String[] args) {
    int[] nums = {2,7,11,15};
    int target = 9;
    int i=0, j=0;
    
    for(i=0; i<nums.length; i++){
      for(j=i+1; j<nums.length; j++){
        if((nums[i] + nums[j])==target){
          System.out.println(i+" "+j);
          break;
        }
      }
    }
    
  }

}
