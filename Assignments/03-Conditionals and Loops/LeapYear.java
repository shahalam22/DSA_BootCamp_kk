package Assignment2;

//Checking leap year

import java.util.Scanner;

public class LeapYear {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter year : ");
    int year = input.nextInt();
    if(year%400==0){
      System.out.print("This is a leap year.");
    }
    else if(year%100==0){
      System.out.print("This is not a leap year.");
    }
    else if(year%4==0){
      System.out.print("This is a leap year.");
    }
    else{
      System.out.print("This is not a leap year.");
    }
  }

}
