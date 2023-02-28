package Assignment5;

public class PickNum {

  public static void main(String[] args) {
    long num = 10, pick = 6;
    long start = 0, end = num, mid = 0;
    while(start<=end){
      mid = start + (end-start)/2;
      if(pick<mid){
        end = mid-1;
      }
      else if(pick>mid){
        start = mid+1;
      }
      else if(mid==pick){
        //System.out.println(mid);
        break;
      }
    }
    System.out.println(mid);
  }

}
