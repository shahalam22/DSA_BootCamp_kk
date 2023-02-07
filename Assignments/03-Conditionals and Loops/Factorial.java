package Assignment2;

//Factorial of nth number. 

import java.util.Scanner;

public class Factorial {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int a = input.nextInt();
    int j = 1;
    for(int i=1; i<=a; i++){
      j = j*i;
    }
    System.out.printf("The factorial of %d is %d", a, j);
  }

}
