package demo;

//write code to find Armstrong number.

import java.util.Scanner;

public class ArmstrongNumber {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt();
    System.out.println(amstng(a));
  }
  static Boolean amstng(int n){
    int a=0, temp=n, b;
    while(n>0){
      b = n%10;
      n = n/10;
      a = a + (b*b*b); 
    }
    if(temp == a) return true;
    else return false;
  }
}
