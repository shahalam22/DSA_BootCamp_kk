package Assignment3;

//Write a program to print the product of two numbers entered by user by defining your own method.

import java.util.Scanner;

public class ProductOfTwo {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number : ");
    float n1 = input.nextFloat();
    System.out.print("Enter another number : ");
    float n2 = input.nextFloat();
    product(n1, n2);
  }
  
  static void product(float a, float b){
    float c = a*b;
    System.out.print("Product of the numbers is : "+c);
  }

}

