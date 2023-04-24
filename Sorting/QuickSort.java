import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] nums = {5,1,9,7,3,2,8,6,4};
		
		quick(nums, 0, (nums.length-1));
		
		System.out.println(Arrays.toString(nums));

	}
	
	
	static void quick(int[] a, int s, int e) {
		if(s<e) {
			int p = partition(a, s, e);
			quick(a, s, p-1);
			quick(a, p+1, e);
		}
	}
	
	
	static int partition(int[] a, int s, int e) {		

		int pivot = a[e];
		int i = s-1;
		for(int j = s; j<e; j++) {
			if(a[j]<pivot) {
				i++;
				swap(a, i, j);
			}
		}
		swap(a, i+1, e);
		
		return i+1;
	}
	
	
	static void swap(int[] a, int m, int n) {
		int temp = a[m];
		a[m] = a[n];
		a[n] = temp;
	}

}
