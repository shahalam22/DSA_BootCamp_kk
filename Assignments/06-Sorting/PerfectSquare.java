package Assignment5;

public class PerfectSquare {

  public static void main(String[] args) {
    int num = 2147483647;
    long i=2;
    long j=num/2;
    if(num==1){
      System.out.println("true");
      return;
    }
    while(i<=j){
      long mid = (i+j)/2;
      if(mid*mid==num){
        System.out.println("True");
        return;
      }
      else if(mid*mid<num){
        i=mid+1;
      }
      else if(mid*mid>num){
        j=mid-1;
      }
    }
    System.out.println("false");
    return;
  }

}