package Assignment2;

import java.util.Scanner;

public class ReverseNumber {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a, b;
    int d=0;
    a = input.nextInt();
    while(a>0){
      b = a%10;
      a = a/10;
      d = d*10 + b;
    }
    
  }
}
