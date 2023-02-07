package Assignment2;

//Calculating future of invested capital

import java.util.Scanner;

public class FutureInvestment {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter amount of capital you want to invest : ");
    double capital = input.nextDouble();
    System.out.print("Enter the rate of interest (in %) : ");
    double rate = input.nextDouble();
    System.out.print("Enter the time period of investment : ");
    double time = input.nextDouble();
    
    for(int i=0; i<time; i++){
      capital = capital + (capital*rate/100);
    }
    
    System.out.println("You will get "+capital+" taka as return.");
  }

}
