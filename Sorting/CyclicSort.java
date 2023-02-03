import java.util.Arrays;

public class CyclicSort {

  public static void main(String[] args) {
    int[] arr = {4,3,0,2,1};
    cyclicSort(arr);
    System.out.println(Arrays.toString(arr));
  }
  
  static void cyclicSort(int[] arr){
    int i=0;
    while(i<arr.length){
      int correct = arr[i];
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
 
