package sorting;

import java.util.Arrays;

public class MaxProductOf3Num {

	public static void main(String[] args) {
		
		int[] nums = {-1,-2,-3, -4};
		
		Arrays.sort(nums);
		
		int product = 1;
		
		System.out.println(Arrays.toString(nums));
		
		if(nums[nums.length-1]<0) {
			if((nums[0]*nums[1])<(nums[nums.length-3]*nums[nums.length-2])){
				product = nums[0]*nums[1]*nums[nums.length-1];
				System.out.println(product);
				return;
			}
			else if((nums[0]*nums[1])>=(nums[nums.length-3]*nums[nums.length-2])){
				product = nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1];
				System.out.println(product);
				return;
			}
		}
		
		if((nums[0]*nums[1])>(nums[nums.length-3]*nums[nums.length-2])){
			product = nums[0]*nums[1]*nums[nums.length-1];
			System.out.println(product);
			return;
		}
		else if((nums[0]*nums[1])<=(nums[nums.length-3]*nums[nums.length-2])){
			product = nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1];
			System.out.println(product);
			return;
		}
	}

}
