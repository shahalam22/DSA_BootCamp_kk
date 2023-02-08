package Assignment3;

/*
Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

 
Marks        Grade 
91-100         AA 
81-90          AB 
71-80          BB 
61-70          BC 
51-60          CD 
41-50          DD 
<=40          Fail
*/

import java.util.Scanner;

public class GPA {

  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your marks : ");
    double marks = input.nextInt();
    grade(marks);

  }
  
  static void grade(double a){
    if(a>=91 && a<=100) System.out.println("Your Grade is AA");
    else if(a>=81 && a<=90) System.out.println("Your Grade is AB");
    else if(a>=71 && a<=80) System.out.println("Your Grade is BB");
    else if(a>=61 && a<=70) System.out.println("Your Grade is BC");
    else if(a>=51 && a<=60) System.out.println("Your Grade is CD");
    else if(a>=41 && a<=50) System.out.println("Your Grade is DD");
    else System.out.println("You are failed!");
  }
  
}
