
//Parameter of a circle

import java.util.Scanner;

public class PeriOfCircle {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the radius of circle : ");
    double rad = input.nextDouble();
    double parameter = 3.1416*2*rad;
    System.out.printf("Perimeter of the circle is %.2f", parameter);
  }

}
