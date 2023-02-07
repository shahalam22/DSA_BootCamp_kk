package Assignment2;

//Discount of a product 

import java.util.Scanner;

public class Discount {

  public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter price of the product : ");
  double price = input.nextDouble();
  System.out.print("Enter discount (in %) of the product : ");
  double offer = input.nextDouble();
  double discount = price*offer/100;
  System.out.println("You got "+discount+" taka discount over the product. \nPlease pay "+(price - discount)+" taka for checkout.");
  }

}
