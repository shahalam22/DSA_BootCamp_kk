package Assignment3;

//Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).

import java.util.Scanner;

public class Pythagorean {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter 1st arm of triplet : ");
    int n1 = input.nextInt();
    System.out.print("Enter 2nd arm of triplet : ");
    int n2 = input.nextInt();
    System.out.print("Enter 3rd arm of triplet : ");
    int n3 = input.nextInt();
    
    pythagoras(n1, n2, n3);
  }
  
  static void pythagoras(int a, int b, int c){
    double d, e, f;
    d = Math.sqrt(a*a + b*b);
    e = Math.sqrt(b*b + c*c);
    f = Math.sqrt(c*c + a*a);
    if(c==d || a==e || f==b){
      System.out.println("This is a pythagorean triplet.");
    }
    else{
      System.out.println("This is not a pythagorean triplet.");
    }
  }
  
}
