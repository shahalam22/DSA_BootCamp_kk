package Assignment2;

//Area of a Rhombus 

import java.util.Scanner;

public class AreaOfRhombus {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 1st diagonal of Rhombus : ");
    double dia1 = input.nextDouble();
    System.out.println("Enter 2nd diagonal of Rhombus : ");
    double dia2 = input.nextDouble();
    double area = 0.5*dia1*dia2;
    System.out.printf("Area of the Rhombus is %.2f", area);
  }

}


