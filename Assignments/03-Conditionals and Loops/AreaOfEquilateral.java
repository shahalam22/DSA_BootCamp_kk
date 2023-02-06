//Area of a Equilateral triangle 

import java.util.Scanner;

public class AreaOfEquilateral {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter lenght of the side of triangle : ");
    double side = input.nextDouble();
    double rootThree = Math.sqrt(3);
    double area = rootThree*side*side/4;
    System.out.printf("Area of the Rhombus is %.2f", area);
  }

}


