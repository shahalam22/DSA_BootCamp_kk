package Assignment5;

public class Sqrt {

  public static void main(String[] args) {
    int x = 2147395600;
    if(x==0){
      System.out.println(0);
      return;
    }
      int i=1;
      for(;i<=x/i;i++) {
        if(x/i==i){
          System.out.println(i);
          break;
        }
      }
    System.out.println(i-1);
  }
}