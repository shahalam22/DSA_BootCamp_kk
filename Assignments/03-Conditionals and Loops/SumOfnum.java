package Assignment2;

//Take integer inputs till the user enters 0 and print the sum of all numbers.

import java.util.Scanner;

public class SumOfnum {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int i=1, sum=0;
    while(i!=0){
      System.out.print("Enter new number : ");
      i = input.nextInt();
      sum = sum + i;
    }
    System.out.println("Sum of all the numbers you entered is " + (sum));
  }

}
