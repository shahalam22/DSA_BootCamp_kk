import java.util.List;
import java.util.ArrayList;

public class AllMissingNumber {

  public static void main(String[] args) {
    int[] arr = {3,3,3,3,3,3,3,3};
    System.out.println(MissingNumber(arr));
  }
  
  public static List<Integer> MissingNumber(int[] arr){
    
    cyclicSort(arr);
    
    List<Integer> ans = new ArrayList<>();
    
    for(int i=0; i<arr.length; i++){
      if(arr[i]!=(i+1)){
        ans.add(i+1);
      }
    }
    
    return ans;
  }
  
  static void cyclicSort(int[] arr){
    int i=0;
    while(i<arr.length){
      int correct = arr[i]-1;
      if(arr[i]<arr.length && arr[i]!=arr[correct]){
        swap(arr, i, correct);
      }
      //43021-13024-31024-21034-01234
      else{
        i++;
      }
    }
  }
   
  static void swap(int[] arr, int start, int end){
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
  }
}
