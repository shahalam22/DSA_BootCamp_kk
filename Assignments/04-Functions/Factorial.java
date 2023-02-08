package Assignment3;

/*
Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
4! = 1 * 2 * 3 * 4 = 24 
3! = 3 * 2 * 1 = 6 
2! = 2 * 1 = 2 
Also, 
1! = 1 
0! = 1
*/

import java.util.Scanner;

public class Factorial {

  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = input.nextInt();
    factorial(num);

  }
  
  static void factorial(int a){
    int j = 1;
    if(a==0) System.out.print("0! = 1");
    else if(a==1) System.out.print("1! = 1");
    else{
      System.out.print(a+"! = ");
      for(int i=1; i<=a; i++){
        j = j*i;
        System.out.print(i);
        if(i<a) System.out.print("*");
      }
      System.out.print(" = "+j);
    }
  }

}
