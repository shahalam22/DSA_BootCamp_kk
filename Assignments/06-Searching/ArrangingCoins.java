package Assignment5;

public class ArrangingCoins {

  public static void main(String[] args) {
    int n = 6;
    int count = 0;
    for(int i=1; n>0; i++){
      n = n-i;
      count++;
    }
    if(n==0){
      System.out.println(count);
    }
    else if(n<0){
      System.out.println(count-1);
    }
  }

}
