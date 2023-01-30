//Problem : // https://leetcode.com/problems/peak-index-in-a-mountain-array/
	    // https://leetcode.com/problems/find-peak-element/

public class P6MountainArray{

  public static void main(String[] args) {
    int[] num = {1,2,4,7,9,12,11,10,8,6,5,3};
    int ans = binarySearch(num);
    System.out.print(ans);
  }
  
  static int binarySearch(int[] arr){
    int start = 0;
    int end = arr.length -1;
    
    while(start<end){
    
      int mid = start + ((end - start)/2);    
    
      if(arr[mid]>arr[mid+1]){
        end = mid;
      }
      else if(arr[mid]<arr[mid+1]){
        start = mid + 1;
      }
    }
    return start;
  }
  
}
