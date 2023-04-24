package sorting;

public class MajorityElement {

	public static void main(String[] args) {
		
		int[] nums = {2,2,1,1,1,2,2};
		mergeSort(nums, 0, nums.length-1);
		
		//System.out.println(Arrays.toString(nums));
		
		int a = nums[nums.length-1];
		
		int max = 0;
		int mkey = nums[0];
		
		for(int i = 0; i<=a; i++) {
			int key = i;
			int value = 0;
			for(int j=0; j<nums.length; j++) {
				if(nums[j]==key) value++;
			}
//			System.out.println(key);
//			System.out.println(value);
			if(value>max) {
				max = value;
				mkey = i;
			}
		}
		
		System.out.println(mkey);
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
