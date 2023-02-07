package Assignment2;

import java.util.Scanner;

public class PalindromeNumber {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a, b, d=0;
    System.out.println("Enter a number : ");
    a = input.nextInt();
    int copya = a;
    while(a>0){
      b = a%10;
      a = a/10;
      d = d*10 + b;
    }
    if(d==copya){
      System.out.println("This is a palindrome number.");
    }
    else{
      System.out.println("This is not a palindrome number.");
    }
  }
}
