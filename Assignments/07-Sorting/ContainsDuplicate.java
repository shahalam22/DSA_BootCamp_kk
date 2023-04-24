package sorting;

import java.util.Arrays;

public class ContainsDuplicate {

	public static void main(String[] args) {
		
		int[] nums = {1,1,1,3,3,4,3,2,4,2};
		
		Arrays.sort(nums);
		
		int flag = 0;
		
		for(int i=0; i<nums.length-1; i++) {
			if(nums[i]==nums[i+1]) {
				flag = 1;
				break;
			}
		}
		
		if(flag==0) System.out.println("false");
		if(flag==1) System.out.println("true");

	}

}
