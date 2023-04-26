package Assignment2;

//Parameter of a rectangle

import java.util.Scanner;

public class PeriOfRect {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter one side of rectangle : ");
    double side1 = input.nextDouble();
    System.out.println("Enter another side of rectangle : ");
    double side2 = input.nextDouble();
    double parameter = 2*(side1 + side2);
    System.out.printf("Perimeter of the rectangle is %.2f", parameter);
  }

}
