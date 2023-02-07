package Assignment2;

//Volume of a Pyramid

import java.util.Scanner;

public class VolOfPyramid {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter height of the Pyramid : ");
    double height = input.nextDouble();
    System.out.print("Enter area of base of the Pyramid : ");
    double base = input.nextDouble();
    double volume = base*height/3;
    System.out.printf("Volume of the Pyramid is %.2f", volume);
  }

}

