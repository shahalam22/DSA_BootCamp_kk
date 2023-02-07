package Assignment2;

//Subtraction of product and sum of two integers.

import java.util.Scanner;

public class SubOfSumAndProduct {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first number : ");
    double a = input.nextDouble();
    System.out.print("Enter second number : ");
    double b = input.nextDouble();
    double sum = a+b;
    double product = a*b;
    double sub = product-sum;
    System.out.println("Answer is "+sub);
  }

}
