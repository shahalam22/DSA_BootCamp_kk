public class P3MinimumNumber {

  public static void main(String[] args) {
    int[] arr = {14, 18, 9, 4, -7, 16, 2};
    int min = minimum(arr);
    int index = minindex(arr, min);
    System.out.print(min+" is minimum value in "+index+" index.");
  }
  static int minimum(int[] arr){
    int min = arr[0];
    for(int i=0; i<arr.length; i++){
      if(arr[i]<min) min = arr[i];
    }
    return min;
  }
  static int minindex(int[] arr, int min){
    int i;
    for( i=0; i<arr.length; i++){
      if(arr[i]==min) break;
    }
    return i;
  }
}
