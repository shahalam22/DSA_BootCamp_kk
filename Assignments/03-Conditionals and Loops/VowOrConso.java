package Assignment2;

import java.util.Scanner;

public class VowOrConso {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char ch;
    System.out.print("Enter a character: ");
    ch = input.next().trim().charAt(0);
    if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
      System.out.print("It's a VOWEL");
    }
    else {
      System.out.print("It's a CONSONANT");
    }
  }

}
