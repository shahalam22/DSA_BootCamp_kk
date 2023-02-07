package Assignment2;

//Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class LargeOfNums {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int i=1, max=0;
    while(i!=0){
    System.out.print("Enter new number : ");
      i = input.nextInt();
      if(i>max) max = i;
    }
    System.out.println("Maximum of the numbers you entered is "+max);
  }

}
