import java.util.Arrays;

public class SetMisMatch {

  public static void main(String[] args) {
    int[] arr = {3,2,3,4,6,5};
    System.out.println(Arrays.toString(duplicate(arr)));
  }
  
  static int[] duplicate(int[] arr){
    int i;
    cyclicSort(arr);
    
    for(i=0; i<arr.length; i++){
      if(arr[i]!=i+1){
        break;
      }
    }
    return new int[] {arr[i], i+1};
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
