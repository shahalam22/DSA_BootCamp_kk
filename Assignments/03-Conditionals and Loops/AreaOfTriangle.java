package Assignment2;

//Area of a Triangle

import java.util.Scanner;

public class AreaOfTriangle {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 1st side of Triangle : ");
    double a = input.nextDouble();
    System.out.println("Enter 2nd side of Triangle : ");
    double b = input.nextDouble();
    System.out.println("Enter 3rd side of Triangle : ");
    double c = input.nextDouble();
    double s = (a+b+c)/2;
    double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.printf("Area of the Triangle is %.2f", area);
  }

}
