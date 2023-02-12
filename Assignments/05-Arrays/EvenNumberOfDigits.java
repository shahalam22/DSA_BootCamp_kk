package Assignment4;

public class EvenNumberOfDigits {

  public static void main(String[] args) {
    int[] nums = {12,324,2,123,2738};
    int count = 0;
    for(int i=0; i<nums.length; i++){
      int j=0;
      while(nums[i]>0){
        nums[i] = nums[i]/10;
        j++;
      }
      if(j%2==0) count++;
    }
    System.out.println(count);
  }

}
