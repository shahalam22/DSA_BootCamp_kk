package Assignment2;

//Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOfNumbers {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    List<Integer> list = new ArrayList<Integer>();
    int neg=0, eve=0, odd=0, a=1;
    for(int i=0; a!=0; i++){
      System.out.println("Enter element of list : ");
      a = input.nextInt();
      list.add(a);
      if(a>0 && a%2==0){
        eve = eve + a;
      }
      else if(a>0 && a%2==1){
        odd = odd + a;
      }
      else{
        neg = neg + a;
      }
    }
    System.out.println("Sum of negative numbers is "+neg+".");
    System.out.println("Sum of positive even numbers is "+eve+".");
    System.out.println("Sum of positive odd numbers is "+odd+".");
  }

}
