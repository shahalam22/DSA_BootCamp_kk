package Assignment3;

//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

import java.util.Scanner;

public class EligibleToVote {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your age : ");
    int age = input.nextInt();
    canVote(age);
  }
  
  static void canVote(int a){
    if(a>=18) System.out.print("Congratulations! You are eligible to vote.");
    else System.out.print("Sorry! You aren’t eligible to vote.");
  }

}
