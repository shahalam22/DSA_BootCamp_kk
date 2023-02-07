package Assignment2;

//Find electric bill

import java.util.Scanner;

public class ElectricBill {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the unit you have used: ");
    double unit = input.nextDouble();
    System.out.print("Enter the cost per unit you have used: ");
    double cost = input.nextDouble();
    double bill = unit*cost;
    System.out.println("Your Electricity bill is : " + bill + " taka");
  }

}
