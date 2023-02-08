package Assignment3;

//Write a function to find if a number is a palindrome or not. Take number as parameter.

import java.util.Scanner;

public class Palindrome {

  public static void main(String[] args) {
    System.out.println("Enter a number : ");
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    pal(num);
  }
  
  static void pal(int a){
    int b, d=0;
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
