package Assignment2;

//Volume of a Cylinder

import java.util.Scanner;

public class VolOfCylinder {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter height of the Cylinder : ");
    double height = input.nextDouble();
    System.out.print("Enter radius of base of the Cylinder : ");
    double base = input.nextDouble();
    double volume = 3.1416*base*base*height;
    System.out.printf("Volume of the Cylinder is %.2f", volume);
  }

}

