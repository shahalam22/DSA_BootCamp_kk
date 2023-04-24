package sorting;

import java.util.Arrays;

public class SortByParity2 {

	public static void main(String[] args) {
		
		int[] nums = {4,2,5,7};
		
		Arrays.sort(nums);
		
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
		
		s = 1;
		e = nums.length-2;
		
		while(s<e) {
			int temp = nums[s];
			nums[s] = nums[e];
			nums[e] = temp;
			s = s + 2;
			e = e - 2;
		}
		
		System.out.println(Arrays.toString(nums));
		
//		int i = 0;
//		if(nums[i]%2==0) {
//			System.out.println(Arrays.toString(nums));
//			return;
//		}
//		
//		for(int j = 0; j<nums.length-1; j=j+2) {
//			int temp = nums[j];
//			nums[j] = nums[j+1];
//			nums[j+1] = temp;
//		}
//		System.out.println(Arrays.toString(nums));
//		return;
	}

}
