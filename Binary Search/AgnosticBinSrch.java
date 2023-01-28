public class AgnosticBinSrch {

  public static void main(String[] args) {
    int[] num1 = {1,2,4,7,9,12,15,18,21,24,27,32};
    int[] num2 = {32,27,24,21,18,15,12,9,7,4,2,1};
    int target = 27;
    int ans = binarySearch(num1, target);
    System.out.print(ans);
  }

  static int binarySearch(int[] arr, int target){
    int start = 0;
    int end = arr.length -1;
    
    Boolean isAsc = arr[start]<arr[end];
    
    while(start<=end){    
      int mid = start + ((end - start)/2);      
      if(target==arr[mid]) return mid;      
      if(isAsc){           
        if(target<arr[mid]){
          end = mid - 1;
        }
        else if(target>arr[mid]){
          start = mid + 1;
        }
      }      
      else{
        if(target>arr[mid]){
          end = mid - 1;
        }
        else if(target<arr[mid]){
          start = mid + 1;
        }
      }      
    }
    return -1;
  }

}

