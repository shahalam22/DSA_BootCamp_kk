package Assignment2;

//Volume of a Prism

import java.util.Scanner;

public class VolOfPrism {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter height of the Prism : ");
    double height = input.nextDouble();
    System.out.print("Enter base area of the Prism : ");
    double base = input.nextDouble();
    double volume = base*height;
    System.out.printf("Volume of the Prism is %.2f", volume);
  }

}
