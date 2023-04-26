package Assignment2;

//Parameter of a square

import java.util.Scanner;

public class PeriOfSqr {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter side of square : ");
    double side = input.nextDouble();
    double parameter = 4*(side);
    System.out.printf("Perimeter of the square is %.2f", parameter);
  }

}
