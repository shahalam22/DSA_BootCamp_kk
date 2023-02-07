package Assignment2;

//Average of N numbers we entered.

import java.util.Scanner;

public class AverageOfN {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter N : ");
    int n = input.nextInt();
    int sum = 0;
    for(int i=0; i<n; i++){
      System.out.print("Enter "+(i+1)+" number : ");
      int a = input.nextInt();
      sum = sum + a;
    }
    System.out.println("Average is : " + ((float)sum/n));
  }

}
