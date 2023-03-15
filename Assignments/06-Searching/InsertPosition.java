package Assignment5;

public class InsertPosition {

  public static void main(String[] args) {
    int[] nums = {1,2,1};
    int target = 7;
    int l = 0;
    int h = nums.length - 1;
        if(target<nums[0]){
          System.out.println(0);
          return;
        }
        else if(target>nums[nums.length-1]){
          System.out.println(nums.length);
          return;
        }
    while(l<=h){
      int mid = (h+l)/2;
      if(target<nums[mid]){
        h = mid-1;
      }
      else{
        l = mid+1;
      }
    }
    if(target==nums[h]) System.out.println(h);
    else System.out.println(h+1);
    }

  }


