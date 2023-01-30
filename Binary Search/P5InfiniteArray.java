//Problem : https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers

public class P5InfiniteArray {

  public static void main(String[] args) {
    int[] num = {1,2,4,7,9,12,15,18,21,24,27,32,33,38,40,43,47,49,51,52,53,54,55,56,57,58};
    int target = 21;
    System.out.print(search(num, target));
  }
  
  static int search(int[] arr, int target){
    int start = 0;
    int end = 1;
    
    while(target>arr[end]){
      int temp = end+1;
      end = (end-start+1)*2;
      start = temp;
    }
    return binarySearch(arr, target, start, end);
  }
  
  static int binarySearch(int[] arr, int target, int start, int end){
    while(start<=end){
      int mid = start + ((end - start)/2);    
      if(target<arr[mid]){
        end = mid - 1;
      }
      else if(target>arr[mid]){
        start = mid + 1;
      }
      else{
        return mid;
      }
    }
    return -1;
  }
  
}
