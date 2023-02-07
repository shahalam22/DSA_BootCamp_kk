package Assignment2;

//Finding least common multiple (LCM)

import java.util.Scanner;

public class LCM {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 1st number : ");
    int n1 = input.nextInt();
    System.out.println("Enter 2nd number : ");
    int n2 = input.nextInt();
    int max = max(n1, n2);
    int lcm = max;
    for(int i=max; ; i++){
      if(i%n1==0 && i%n2==0){
        lcm = i;
        break;
      }
    }
    System.out.println("LCM is "+lcm);
  }

  static int max(int a, int b){
    if(a>=b) return a;
    else return b;
  }

}
