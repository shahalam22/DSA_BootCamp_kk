package Assignment2;

//Volume of a cone

import java.util.Scanner;

public class CurvedAreaOfCylinder {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter height of the Cylinder : ");
    double height = input.nextDouble();
    System.out.print("Enter radius of base of the Cylinder : ");
    double base = input.nextDouble();
    double curvedArea = 2*3.1416*base*height;
    System.out.printf("Volume of the Cylinder is %.2f", curvedArea);
  }

}
