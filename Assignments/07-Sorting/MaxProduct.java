import java.util.Arrays;

public class MaxProduct {
    public static void main(String[] args) {
        int[] nums = {3,4,5,2};
        Arrays.sort(nums);
        int ans = (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
        System.out.println(ans);
    }
}
