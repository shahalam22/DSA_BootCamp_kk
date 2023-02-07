package Assignment2;

//Volume of a cone

import java.util.Scanner;

public class VolOfCone {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter height of the cone : ");
    double height = input.nextDouble();
    System.out.print("Enter radius of base of the cone : ");
    double base = input.nextDouble();
    double volume = 1*3.1416*base*base*height/3;
    System.out.printf("Volume of the cone is %.2f", volume);
  }

}
