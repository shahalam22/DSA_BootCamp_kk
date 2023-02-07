package Assignment2;

//Calculating power of an entered number

import java.util.Scanner;

public class PowerInJava {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Entet base : ");
    double base = input.nextDouble();
    System.out.print("Entet power : ");
    double power = input.nextDouble();
    double ans = Math.pow(base, power);
    System.out.printf("Answer is %.2f", ans);
  }

}
