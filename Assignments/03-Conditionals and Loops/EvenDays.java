package Assignment2;

//Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.

import java.util.Scanner;

public class EvenDays {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter month's number : ");
    int mth = input.nextInt();
    if(mth==2){
      System.out.println("Even number of days in this month is 14.");
    }
    else{
      System.out.println("Even number of days in this month is 15.");
    }
  }

}
