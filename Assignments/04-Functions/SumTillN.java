package Assignment3;

//Write a function that returns the sum of first n natural numbers.

import java.util.Scanner;

public class SumTillN {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter value of N : ");
    int num = input.nextInt();
    int ans = sumN(num);
    System.out.printf("Sum of numbers till %d is %d", num, ans);
  }
  
  static int sumN(int n){
    int sum = 0;
    for(int i=1; i<=n; i++){
      sum = sum + i;
    }
    return sum;
  }

}
