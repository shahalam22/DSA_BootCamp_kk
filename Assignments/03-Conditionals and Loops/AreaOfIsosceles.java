//Area of a Triangle

import java.util.Scanner;

public class AreaOfIsosceles {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter base of Triangle : ");
    double base = input.nextDouble();
    System.out.println("Enter height of Triangle : ");
    double height = input.nextDouble();
    double area = 0.5*base*height;
    System.out.printf("Area of the Triangle is %.2f", area);
  }

}

