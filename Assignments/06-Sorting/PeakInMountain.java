package Assignment5;

public class PeakInMountain {

  public static void main(String[] args) {
    int[] arr = {1,2,3,4,2,1};
    int l = 0;
    int h = arr.length - 1;
    int mid = 0;
    if(arr[0]>arr[1]){
      System.out.println(0);
      return;
    }
    if(arr[arr.length-1]>arr[arr.length-2]){
      System.out.println(arr.length-1);
      return;
    }
    while(l<=h){
      mid = (l+h)/2;
      if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
        //System.out.println(mid);
        //return;
        break;
      }
      else if(arr[mid]>arr[mid-1]){
        l = mid+1;
      }
      else if(arr[mid]<arr[mid-1]){
        h = mid-1;
      }
    }
    //if(h==l) System.out.println(h-1);
    //else System.out.println(h);
    System.out.println(mid);
  }

}
