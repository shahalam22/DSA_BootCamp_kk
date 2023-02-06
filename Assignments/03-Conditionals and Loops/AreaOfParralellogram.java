//Area of a Parralellogram

import java.util.Scanner;

public class AreaOfParralellogram {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter height of Parralellogram: ");
    double height = input.nextDouble();
    System.out.println("Enter base of Parralellogram: ");
    double base = input.nextDouble();
    double area = base*height;
    System.out.printf("Area of the Parralellogram is %.2f", area);
  }

}

