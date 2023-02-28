package Assignment5;

public class SpecialArray {

  public static void main(String[] args) {
    int[] nums = {3,5,2};    
    int max = 0, count = 0;    
    for(int i=0; i<nums.length; i++){
      if(nums[i]>max){
        max = nums[i];
      }
    }    
    for(int j=0; j<=max; j++){
      count = 0;
      for(int k=0; k<nums.length; k++){
        if(nums[k]>=j){
          count++;
        }
      }
      if(count==j){
        System.out.println(j);
        return;
      }
    }
    System.out.println(-1);
    return;
  }

}
