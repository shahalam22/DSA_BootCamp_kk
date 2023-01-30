public class P4FirstAndLastPosition {

  public static void main(String[] args) {
    int[] num = {1,1,2,3,3,3,3,4,4,5};
    int target = 3;
    int[] ans = binarySearch(num, target);
    System.out.println((ans[0]+1)+" "+(ans[1]+1));
  }
  
  static int[] binarySearch(int[] arr, int target){
    int[] ans = new int[2];
    ans[0] = search(arr, target, true);
    if(ans[0]==-1){
      ans[1]=-1;
    }
    else {
      ans[1] = search(arr, target, false);
    }
    return ans;
  }
  
  static int search(int[] arr, int target, Boolean isStart){
    int start = 0;
    int end = arr.length -1;    
    int ans = -1;    
    while(start<=end){    
      int mid = start + ((end - start)/2);        
      if(target<arr[mid]){
        end = mid - 1;
      }
      else if(target>arr[mid]){
        start = mid + 1;
      }
      else{
        ans = mid;
        if(isStart){
          end = mid-1;
        }
        else{
          start = mid+1;
        }
      }
    }
    return ans;
  }

}
