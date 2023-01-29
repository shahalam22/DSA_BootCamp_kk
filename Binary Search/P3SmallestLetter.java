public class P3SmallestLetter {

  public static void main(String[] args) {
    char[] ch = {'a', 'c', 'd', 'f', 'h', 'k', 'o'};
    char target = 'o';
    char ans = binarySearch(ch, target);
    System.out.println(ans);
  }
  
  static char binarySearch(char[] arr, char target){
    int start = 0;
    int end = arr.length - 1;
    
   // if(target > arr[end]) 
    
    while(start<=end){
    
      int mid = start + ((end - start)/2);    
    
      if(target<arr[mid]){
        end = mid - 1;
      }
      else {
        start = mid + 1;
      }
      //else return arr[start % arr.length];
    }
    return arr[start % arr.length];
  }

}
