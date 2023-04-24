public class DuplicateNumber {

  public static void main(String[] args) {
    int[] arr = {2,1,1,3};
    System.out.println(cyclicSort(arr));
  }
  
  static int cyclicSort(int[] arr){
    int i=0;
    while(i<arr.length){
      if(arr[i]!=i+1){
        int correct = arr[i]-1;
        if(arr[i]!=arr[correct]){
          swap(arr, i, correct);
        }
        else return arr[i];
      }
      //43021-13024-31024-21034-01234
      else{
        i++;
      }
    }
    return -1;
  }
   
  static void swap(int[] arr, int start, int end){
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
  }
}
