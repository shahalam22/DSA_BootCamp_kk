package Assignment3;

//Define a program to find out whether a given number is even or odd.

import java.util.Scanner;

public class OddEven {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number : ");
    int a = input.nextInt();
    int ans = oddEven(a);
    
    if(ans==0) System.out.print("This is ZERO.");
    else if(ans==1) System.out.print("This is an ODD number.");
    else if(ans==2) System.out.print("This is an EVEN number.");
  }
  
  static int oddEven(int a){
    if(a==0) return 0;
    else if(a%2==0) return 2;
    else return 1;
  }

}
