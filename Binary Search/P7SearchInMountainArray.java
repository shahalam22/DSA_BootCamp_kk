public class P7SearchInMountainArray{

  public static void main(String[] args) {
    int[] num = {1,2,4,7,9,12,11,10,8,6,5,3};
    int target = 5;
    int abc = peak(num);
    int ans = binarySearch(num, target, 0, abc);
    if(ans == -1){
      ans = binarySearch(num, target, (abc+1), (num.length - 1));
    }
    System.out.print(ans);
  }
  
  static int peak(int[] arr){
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
  
  static int binarySearch(int[] arr, int target, int start, int end){
    //int start = 0;
    //int end = arr.length -1;
    
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
        else return mid;
      }      
      else{
        if(target>arr[mid]){
          end = mid - 1;
        }
        else if(target<arr[mid]){
          start = mid + 1;
        }
        else return mid;
      }      
    }
    return -1;
  }
  
}
