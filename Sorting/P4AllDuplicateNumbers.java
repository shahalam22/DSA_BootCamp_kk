import java.util.List;
import java.util.ArrayList;

public class AllDuplicateNumbers {

  public static void main(String[] args) {
    int[] arr = {2,1,1,3,4,4,4};
    System.out.println(duplicate(arr));
  }
  
  static List<Integer> duplicate(int[] arr){
    List<Integer> ans = new ArrayList<>();
    cyclicSort(arr);
    
    for(int i=0; i<arr.length; i++){
      if(arr[i]!=i+1){
        ans.add(arr[i]);
      }
    }
    return ans;
  }
  
  static void cyclicSort(int[] arr){
    int i=0;
    while(i<arr.length){
      int correct = arr[i]-1;
      if(arr[i]!=arr[correct]){
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
