package sorting;

import java.util.Arrays;
import java.util.ArrayList;

public class MergeSortedArray {

	public static void main(String[] args) {
		
		int[] nums1 = {-1,0,0,3,3,3,0,0};
		int[] nums2 = {1,2,2};
		int m = 4;
		int n = 3;
		
		ArrayList<Integer> list = new ArrayList<>();
	
		for(int i = 0; i<nums1.length; i++) {
			list.add(nums1[i]);
		}
		for(int i = 0; i<nums2.length; i++) {
			list.add(nums2[i]);
		}
		
		int j = 0;
		
		while(j<list.size()) {
			if(list.get(j)==0) {
				list.remove(j);
			}
			else {
				j++;
			}
			
		}
		
		if(m+n>list.size()) list.add(0);
		
		for(int k = 0; k<list.size(); k++) {
			nums1[k] = list.get(k);
		}
		
    	mergeSort(nums1, 0, nums1.length-1);
		System.out.println(Arrays.toString(nums1));
	}
	
	
	static void mergeSort(int[] a, int s, int e) {
		
		if(s<e) {
			int q = (s+e)/2;
			mergeSort(a, s, q);
			mergeSort(a, q+1, e);
			merge(a, s, q, e);
		}
		
	}
	
	static void merge(int[] a, int s, int q, int e) {
		int n1 = q-s+1;
		int n2 = e-q;
		
		int[] N = new int[n1];
		int[] M = new int[n2];
		
		for(int k=0; k<n1; k++) {
			N[k] = a[k+s];
		}
		for(int w=0; w<n2; w++) {
			M[w] = a[w+q+1];
		}
		
		int i=0, j=0, l=s;
		
		while(i<n1 && j<n2) {
			if(N[i]<=M[j]) {
				a[l] = N[i];
				i++;
				//l++;
			}
			else {
				a[l] = M[j];
				j++;
				//l++;
			}
			l++;
		}
		
		while(i<n1) {
			a[l] = N[i];
			i++;
			l++;
		}
		
		while(j<n2) {
			a[l] = M[j];
			j++;
			l++;
		}
	}

}
