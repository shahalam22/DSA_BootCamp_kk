package Assignment2;

//Parameter of a Equilateral Triangle

import java.util.Scanner;

public class PeriOfEquilateral {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the side of triangle : ");
    double side = input.nextDouble();
    double parameter = 3*side;
    System.out.printf("Perimeter of the triangle is %.2f", parameter);
  }

}
