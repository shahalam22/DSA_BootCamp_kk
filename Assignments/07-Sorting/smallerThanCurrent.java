import java.util.Arrays;

public class smallerThanCurrent {
    public static void main(String[] args) {
        int[] nums = {7,7,7,7};
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[i]>nums[j]) count++;
            }
            ans[i] = count;
        }
        System.out.println(Arrays.toString(ans));
    }
}
