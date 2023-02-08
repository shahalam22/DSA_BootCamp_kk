package Assignment3;

//Define a methode to find whether a number is prime or not.

import java.util.Scanner;

public class PrimeNum {

  public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a number : ");
  int num = input.nextInt();
  int a = isPrime(num);
  if(a==0) System.out.println("It's not a prime number.");
  else System.out.println("It's a prime number.");

  }
  
  static int isPrime(int a){
    for(int i=2; i*i<=a; i++){
      if(a%i==0){
        return 0;
      }
    }
    return 1;
  }

}
