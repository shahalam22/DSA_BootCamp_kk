package Assignment2;

//Calculating depreciation of value

import java.util.Scanner;

public class DepreciationOfValue {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter depreciable value :");
    double value = input.nextDouble();
    System.out.print("Enter depreciation rate (in %) :");
    double rate = input.nextDouble();
    System.out.print("Enter depreciation time :");
    double time = input.nextDouble();
    double depvalue = 0, sum = 0;
    
    for(int i=0; i<time; i++){
      depvalue = value*rate/100;
      value = value - depvalue;
      sum = sum + depvalue;
    }
    
    System.out.printf("Value after depreciation %.2f taka\nDepreciation is %.2f taka", value, sum);
  }

}