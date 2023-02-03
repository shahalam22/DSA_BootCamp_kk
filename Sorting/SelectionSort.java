import java.util.Arrays;

public class SelectionSort {

  public static void main(String[] args) {
    int[] arr = {5,3,4,2,1};
    selectionSort(arr);
    System.out.print(Arrays.toString(arr));
  }

//finding smallest value and place it at required index
//or finding largest value and place it at required index

  static void selectionSort(int[] arr){
    for(int i=0; i< arr.length; i++){
      int k=0;
      int min = arr[i];
      for(int j=i+1; j<arr.length; j++){
        if(arr[j]<min){
          min = arr[j];
          k=j;
        }
      }
      int temp = arr[k];
      arr[k] = arr[i];
      arr[i] = temp;
    }
  }

}
