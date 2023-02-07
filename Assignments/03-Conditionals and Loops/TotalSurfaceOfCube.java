package Assignment2;

//Volume of a cone

import java.util.Scanner;

public class TotalSurfaceOfCube {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter side of the Cube : ");
    double base = input.nextDouble();
    double curvedArea = 6*base*base;
    System.out.printf("Volume of the Cube is %.2f", curvedArea);
  }

}

