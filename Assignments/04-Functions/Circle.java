package Assignment3;

//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

import java.util.Scanner;

public class Circle {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter radius of circle : ");
    double rad = input.nextDouble();
    circum(rad);
    area(rad);
  }
  
  static void circum(double rad){
    double cir = 2*3.1416*rad;
    System.out.println("Circumference of circle is "+cir);
  }
  
  static void area(double rad){
    double are = rad*3.1416*rad;
    System.out.println("Area of circle is "+are);
  }

}
