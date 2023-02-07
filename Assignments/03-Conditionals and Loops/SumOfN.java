package Assignment2;

//Sum of N numbers we entered.

import java.util.Scanner;

public class  SumOfN {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter N : ");
    int n = input.nextInt();
    int sum = 0;
    for(int i=0; i<n; i++){
      System.out.print("Enter "+(i+1)+"'th number : ");
      int a = input.nextInt();
      sum = sum + a;
    }
    System.out.println("Summation of numbers is : " + sum);
  }

}
