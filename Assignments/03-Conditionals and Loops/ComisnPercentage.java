package Assignment2;

//Calculate Commission in percentage

import java.util.Scanner;

public class ComisnPercentage {

  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);
    System.out.print("Enter buying price : ");
    double buy = input.nextDouble();
    System.out.print("Enter selling price : ");
    double sell = input.nextDouble();
    double ans = ((sell-buy)*100)/buy;
    System.out.println("Commission is "+ans+"%");
  }

}
