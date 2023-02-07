package Assignment2;

//Parameter of parallelogram

import java.util.Scanner;

public class ParaOfParalellogram {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double[] side = new double[4];
    double sum=0;
    for(int i=0; i<side.length; i++){
      System.out.printf("Enter %dth side of parallelogram : ", i+1);
      side[i] = input.nextDouble();
      sum = sum + side[i];
    }
    System.out.println("Perimeter of parallelogram is "+sum);
  }

}
