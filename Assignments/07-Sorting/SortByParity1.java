package sorting;

import java.util.Arrays;

public class SortByParity1 {

	public static void main(String[] args) {
		
		int[] nums = {0,1};
		
		int s = 0;
		int e = nums.length-1;
		
		while(s<e) {
			if(nums[e]%2==0 && nums[s]%2==1) {
				int temp = nums[e];
				nums[e] = nums[s];
				nums[s] = temp;
				e--;
				s++;
			}
			if(nums[e]%2==1) e--;
			if(nums[s]%2==0) s++;
		}
		System.out.print(Arrays.toString(nums));
	}

}
