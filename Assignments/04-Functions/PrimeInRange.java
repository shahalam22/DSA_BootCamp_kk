package Assignment3;

//Write a function that returns all prime numbers between two given numbers.

import java.util.Scanner;

public class PrimeInRange {

  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);
    System.out.print("Enter lower bound number : ");
    int low = input.nextInt();
    System.out.print("Enter upper bound number : ");
    int high = input.nextInt();
    System.out.printf("Prime numbers between %d and %d is : ", low, high);
    prime(low, high);

  }
  
  static void prime(int low, int high){
    for(int i=low; i<=high; i++){
      int test = isPrime(i);
      if(test==1){
        System.out.print(i+" ");
      }
    }
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
