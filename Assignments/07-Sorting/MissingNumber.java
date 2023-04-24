package sorting;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] nums = {9,6,4,2,3,5,7,0,1};
		
		Arrays.sort(nums);
		
		int flag = 0, ans = 0;
		
		for(int i = 0; i < nums.length; i++) {
			if(i!=nums[i]) {
				flag = 1;
				ans = i;
			}
		}
		
		if(flag==1) System.out.println(ans);
		else System.out.println(ans);

	}

}
