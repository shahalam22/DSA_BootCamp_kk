package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class ThirdMaximumNumber {

	public static void main(String[] args) {
		
		int[] nums = {2,2,3,1};
		
		Arrays.sort(nums);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<nums.length; i++) {
			list.add(nums[i]);
		}
		
		int j = 0;
		
		while(j<list.size()-1) {
			int k = list.get(j);
			if(k==list.get(j+1)) {
				list.remove(j+1);
			}
			else j++;
		}
		
		if(list.size()<3) {
			System.out.println(list.get(list.size()-1));
			return;
		}
		
		int[] ans = new int[list.size()];
		
		for(int m=0; m<list.size(); m++) {
			ans[m]=list.get(m);
		}
		
		System.out.println(ans[ans.length-3]);
		return;

	}

}
