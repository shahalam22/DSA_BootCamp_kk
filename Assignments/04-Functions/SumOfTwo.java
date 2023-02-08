package Assignment3;

//Write a program to print the sum of two numbers entered by user by defining your own method.
import java.util.Scanner;

public class SumOfTwo {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n1 = input.nextInt();
    System.out.print("Enter another number : ");
    int n2 = input.nextInt();
    sum(n1, n2);
  }
  
  static void sum(int a, int b){
    int c = a+b;
    System.out.print("Sum of the numbers is : "+c);
  }

}
