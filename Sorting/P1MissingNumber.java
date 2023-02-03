import java.util.Arrays;

//Finding missing number in 0-n numbers of array

public class MissingNumber {

  public static void main(String[] args) {
    int[] arr = {2,0,1};
    System.out.println(MissingNumber(arr));
  }
  
  static int MissingNumber(int[] arr){
    
    cyclicSort(arr);
    
    for(int i=0; i<arr.length; i++){
      if(i!=arr[i]){
        return i;
      }
    }
    return arr.length;
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
