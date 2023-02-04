import java.util.Arrays;

public class FirstMisingPositivInt {

  public static void main(String[] args) {
    int[] arr = {2,3,4,1,-1,-2};
    System.out.println(MissingNumber(arr));
  }
  
  static int MissingNumber(int[] arr){
    
    cyclicSort(arr);
    
    for(int i=0; i<arr.length; i++){
      if(arr[i]!=i+1){
        return i+1;
      }
    }
    return arr.length;
  }
  
  static void cyclicSort(int[] arr){
    int i=0;
    while(i<arr.length){
      int correct = arr[i]-1;
      if(arr[i]>0 && arr[i]<arr.length && arr[i]!=arr[correct]){
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
