public class BinarySearchDes {

  public static void main(String[] args) {
    int[] num = {32,27,24,21,18,15,12,9,7,4,2,1};
    int target = 7;
    int ans = binarySearch(num, target);
    System.out.print(ans);
  }
  
  static int binarySearch(int[] arr, int target){
    int start = 0;
    int end = arr.length - 1;
    
    while(start<=end){
    
    int mid = start + ((end - start)/2);    
    
      if(target>arr[mid]){
        end = mid - 1;
      }
      else if(target<arr[mid]){
        start = mid + 1;
      }
      else{
        return mid;
      }
    }
    return -1;
  }
  
}
