package sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionOfTwoArray {

	public static void main(String[] args) {
		
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		
		ArrayList<Integer> list = new ArrayList<>();
		
		
		if(nums1.length>nums2.length) {
			
			int ans = 0;
			for(int i = 0; i < nums2.length; i++) {
				int flag = 0;
				for(int j=0; j<nums1.length; j++) {
					if(nums2[i]==nums1[j]) {
						flag = 1;
						ans = nums2[i];
						nums1[j] = Integer.MIN_VALUE;
					}
				}
				if(flag==1) list.add(ans);
			}
			
			int[] helo = new int[list.size()];
			
			for(int k=0; k<list.size(); k++) {
				helo[k] = list.get(k);
			}
			
			System.out.println(Arrays.toString(helo));
			
		}
		
		else {
			
			int ans = 0;
			for(int i = 0; i < nums1.length; i++) {
				int flag = 0;
				for(int j=0; j<nums2.length; j++) {
					if(nums1[i]==nums2[j]) {
						flag = 1;
						ans = nums1[i];
						nums2[j] = Integer.MIN_VALUE;
					}
				}
				if(flag==1) list.add(ans);
			}
			
			int[] helo = new int[list.size()];
			
			for(int k=0; k<list.size(); k++) {
				helo[k] = list.get(k);
			}
			
			System.out.println(Arrays.toString(helo));
			
		}
		
		

	}

}
