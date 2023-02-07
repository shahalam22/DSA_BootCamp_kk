package Assignment2;

//Enter a number and print all the factors of the number.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactorsOfNum {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    List<Integer> list = new ArrayList<Integer>();
    System.out.print("Enter a number : ");
    double a = input.nextDouble();
    
    for(int i=1; i<=a; i++){
      if(a%i==0){
        list.add(i);
      }
    }
    System.out.println("Factors of the number is : " + list);
  }

}
