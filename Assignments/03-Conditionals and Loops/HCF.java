package Assignment2;

//Finding highest common factor (HCF)

import java.util.Scanner;

public class HCF {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 1st number : ");
    int n1 = input.nextInt();
    System.out.println("Enter 2nd number : ");
    int n2 = input.nextInt();
    int hcf = 1;
    int min = min(n1, n2);
    for(int i=1; i<=min; i++){
      if(n1%i==0 && n2%i==0){
        hcf = i;
      }
    }
    System.out.println("HCF is "+hcf);
  }

  static int min(int a, int b){
    if(a>=b) return b;
    else return a;
  }

}
