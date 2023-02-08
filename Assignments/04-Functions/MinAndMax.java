package Assignment3;

//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

import java.util.Scanner;

public class MinAndMax {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter 1st number : ");
    int a = input.nextInt();
    System.out.print("Enter 2nd number : ");
    int b = input.nextInt();
    System.out.print("Enter 3rd number : ");
    int c = input.nextInt();
    
    System.out.println("Minimum value is : " + min(a, b, c));
    System.out.println("Maximum value is : " + max(a, b, c));
  }
  
  static int max(int a, int b, int c){
    if(a>b && a>c) return a;
    else if(b>a && b>c) return b;
    else return c;
  }
  
  static int min(int a, int b, int c){
    if(a<b && a<c) return a;
    else if(b<a && b<c) return b;
    else return c;
  }

}
