public class BinarySearchAsc {

  public static void main(String[] args) {
    int[] num = {1,2,4,7,9,12,15,18,21,24,27,32};
    int target = 27;
    int ans = binarySearch(num, target);
    System.out.print(ans);
  }
  
  static int binarySearch(int[] arr, int target){
    int start = 0;
    int end = arr.length -1;
    
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
