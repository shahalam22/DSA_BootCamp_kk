package Assignment2;

//Average of Marks we entered.

import java.util.Scanner;

public class AverageMarks {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter how many marks do you want to enter : ");
    int n = input.nextInt();
    double sum = 0;
    for(int i=0; i<n; i++){
      System.out.print("Enter "+(i+1)+"'s marks : ");
      double a = input.nextDouble();
      sum = sum + a;
    }
    System.out.printf("Average marks is : %.2f", (sum/n));
  }

}
