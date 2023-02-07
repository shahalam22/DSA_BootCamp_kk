package Assignment2;

//Calculate compound interest of value.

import java.util.Scanner;

public class CompoundInterest {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter value :");
    double value = input.nextDouble();
    System.out.print("Enter interest rate :");
    double rate = input.nextDouble();
    System.out.print("Enter time :");
    double time = input.nextDouble();
    
    double interest = (value*(Math.pow((1+(rate/100)),time)))-value;
    System.out.printf("Your compound interest is %.2f taka", interest);
  }

}
