package Assignment2;

//Calculate battimg average of a batsman

import java.util.Scanner;

public class BattingAverage {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("How many ball did bowler delivered : ");
    int ball = input.nextInt();
    int[] hit = new int[ball];
    int sum = 0;
    for(int i=0; i<ball; i++){
      System.out.print("If batsman could hit the ball enter 1, else enter 0 : ");
      hit[i]=input.nextInt();
      sum = sum + hit[i];
    }
    System.out.printf("Batting Average is %.2f", (float)sum/ball);
  }

}
