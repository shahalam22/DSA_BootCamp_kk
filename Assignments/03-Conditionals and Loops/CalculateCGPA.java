package Assignment2;

//Calculate CGPA

import java.util.Scanner;

public class CalculateCGPA {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter how many courses you learned : ");
    int course = input.nextInt();
    double[] GPA = new double[course];
    double[] credit = new double[course];
    double sum = 0, sumCredit = 0;
    
    for(int i=0; i<course; i++){
      System.out.printf("Enter %d course's GPA : ", i+1);
      GPA[i] = input.nextDouble();
      System.out.printf("Enter %d course's credit : ", i+1);
      credit[i] = input.nextDouble();
      sum = sum + (GPA[i]*credit[i]);
      sumCredit = sumCredit + credit[i];
    }
    
    System.out.printf("Your CGPA is %.2f", sum/sumCredit);
  }

}
