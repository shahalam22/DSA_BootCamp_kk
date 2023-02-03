import java.util.Arrays;

public class InsertionSort {

  public static void main(String[] args) {
    int[] arr = {5,-3,2,0,1};
    insertionSort(arr);
    System.out.println(Arrays.toString(arr));
  }

/*we have to get a key = arr[i]. then compare key 
with all elements that are previous element of key
and swap key & element if any of these elements
are greater than key */

  static void insertionSort(int[] arr){
    for(int i=1; i<arr.length; i++){
      for(int j=0; j<i; j++){
        // key = arr[i];
        if(arr[i]<arr[j]){
          int temp = arr[j];
          arr[j] = arr[i];
          arr[i] = temp;
        }
      }
    }
  }

}
