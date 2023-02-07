package Assignment2;

//Volume of a Sphere

import java.util.Scanner;

public class VolOfSphere {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter radius of the Sphere : ");
    double base = input.nextDouble();
    double volume = 4*3.1416*base*base*base/3;
    System.out.printf("Volume of the Sphere is %.2f", volume);
  }

}
