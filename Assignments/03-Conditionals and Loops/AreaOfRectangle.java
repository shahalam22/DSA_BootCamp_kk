//Area of a Rectangle

import java.util.Scanner;

public class AreaOfRectangle {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter height of rectangle: ");
    double height = input.nextDouble();
    System.out.println("Enter width of rectangle: ");
    double width = input.nextDouble();
    double area = width*height;
    System.out.printf("Area of the rectangleis %.2f", area);
  }

}
