public class P2SearchInRange {

  public static void main(String[] args) {
    int[] arr = {12, 18, -7, 9, 4, -14};
    int target= 4;
    System.out.print(search(arr, target, 2, 5));    
  }
  
  static int search(int[] arr,int target, int start, int end){
    for(int i=start; i<end; i++){
      if(target==arr[i]) return i;
    }
    return -1;
  }
  
}
