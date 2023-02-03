import java.util.Arrays;

public class CyclicSort {

  public static void main(String[] args) {
    int[] arr = {5,3,2,4,1};
    cyclicSort(arr);
    System.out.println(Arrays.toString(arr));
  }

/* if there is a condition that, we have to sort 1 to n numbers,
then we can apply cyclic sort. Specialty of cyclic sort is that,
here number n lies at index (n-1) */

  static void cyclicSort(int[] arr){
    for(int i=0; i<arr.length; i++){
      int correct = arr[i]-1;
      if(i!=correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
      }
    }
  }

}
