package Assignment2;

//Distance between two points.

import java.util.Scanner;

public class DistanceBtwnTwoPnts {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] a = new int[2];
    int[] b = new int[2];
    System.out.print("Enter values of x & y of 1st point : ");
    a[0] = input.nextInt();
    a[1] = input.nextInt();
    System.out.print("Enter values of x & y of 2nd point : ");
    b[0] = input.nextInt();
    b[1] = input.nextInt();
    double ans = Math.sqrt(Math.pow((a[0]-b[0]),2) + Math.pow((a[1]-b[1]),2));
    System.out.printf("Distance between a & b is %.2f", ans);
  }

}
