package Assignment2;

//Finding perfect number (perfect number are those, whose divisors sum is equal to the number).

import java.util.Scanner;

public class PerfectNumber {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int num = input.nextInt();
    int sum = 0;
    
    for(int i=1; i<num; i++){
      if(num%i==0){
        sum = sum + i;
      }
    }
    
    if(sum==num){
      System.out.println("It's a perfect number.");
    }
    else {
      System.out.println("It's not a perfect number.");
    }
  }

}
