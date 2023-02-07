package Assignment2;

//Sum of all the digits of a number

import java.util.Scanner;

public class SumOfDigitsOfNumber {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number : ");
    int num = input.nextInt();
    int sum = 0;
    for(int i=0; num>0; i++){
      int d = num%10;
      sum = sum + d;
      num = num/10;
    }
    System.out.println("Sum of the digits of number is "+sum+".");
  }

}
