package Assignment2;

//Parameter of a Rhombus

import java.util.Scanner;

public class PeriOfRhombus {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter side of Rhombus : ");
    double side = input.nextDouble();
    double parameter = 4*(side);
    System.out.printf("Perimeter of the Rhombus is %.2f", parameter);
  }

}
