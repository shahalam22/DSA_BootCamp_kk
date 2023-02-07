package Assignment2;

//Calculating NCR & NPR.

import java.util.Scanner;

public class NCRandNPR {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What do you want to do?\nEnter 1 to perform Combination.\nEnter 2 to perform Permutation.");
    int flag = input.nextInt();
    if(flag==1){
      System.out.print("Enter n : ");
      int n = input.nextInt();
      System.out.print("Enter r : ");
      int r = input.nextInt();
      int ans = combination(n, r);
      System.out.printf("Combination of %d over %d is %d.", n, r, ans);
    }
    else if(flag==2){
      System.out.print("Enter n : ");
      int n = input.nextInt();
      System.out.print("Enter r : ");
      int r = input.nextInt();
      int ans = permutation(n, r);
      System.out.printf("Permutation of %d over %d is %d.", n, r, ans);
    }
    else{
      System.out.print("Enter a valid number.");
    }
  }

  static int factorial(int a){
    int i=1, j=1;
    while(i<=a){
      j = j*i;
      i++;
    }
    return j;
  }
  
  static int combination(int a, int r){
    int comb = factorial(a)/(factorial(r)*factorial(a-r));
    return comb;
  }
  
  static int permutation(int a, int r){
    int per = factorial(a)/factorial(a-r);
    return per;
  }

}
