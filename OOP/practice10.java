//all about exception handling

//syntax error [got found by developer] | logical error [got found by developer] | runtime error [got found by users]

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class practice10 {
    //code of "Code with harry"

//    public static void main(String[] args) {
//        //Syntax error  [ide could suggest fixing solution]
//        //int a = 8 //error : not give any semicolon
//        //  b = 7 //error : b is not declared with any data type
//
//        //Logical error [ide won't show any fixing solution here]
//        //write a program to print all prime numbers between 1 and 10
//        System.out.println(2);
//        for(int i=1; i<5; i++){
//            System.out.println(2*i + 1); // this will print 9 which is not a prime value
//        }
//
//        //Runtime error
//
//    }

    //code of "Coding Wallah"

    public static void main(String[] args) {

        //normal Try-Catch

//        System.out.println("1");
//        System.out.println("2");
//        //System.out.println(6/0);      //this is an ArithmeticException
//        try {
//            System.out.println(6/0);
//        } catch (Exception e){          //here in the place of "Exception" we can use this generalized name or can use more specific exception class name like "NullPointerException" or "ArithmeticException" etc. But, if we use wrong name here it also give another exception and won't go further
//                                        //if we use "ArithmeticException" here in the place of "Exception" it will work. If we use "NullPointerException" here instead it will give another exception or our handling scope won't work.
//            System.out.println(e);
////            System.out.println("You can't divide any number by ZERO");
//        }
//        System.out.println("4");
//        System.out.println("5");
//
//        int[] array = {1,2};
//        //System.out.println(array[2]);   //ArrayIndexOutOfBoundsException
//        try{
//            System.out.println(array[2]);
//        } catch(Exception ex){
//            //System.out.println(ex);
//        }

        //Try-Finally           this process will skip the "Exception" and continues processing the codes within Finally keyword and the exception will be shown at last after completing "finally" scope execution

//        System.out.println("1");
//        System.out.println("2");
//        //System.out.println(6/0);      //this is an ArithmeticException
//        try {
//            System.out.println(6/0);
//            //System.out.println("3");    //for this line our exception message will be shown in this step. else it would work as like try-finally
//        } finally {
//            System.out.println("4");
//            System.out.println("5");
//        }

        //Try-Catch-Finally     this process will handle risky code of "try" and handle this according to "catch" then after completing everything in the EXCEPTION HANDLING then our "finally" scope will execute.

//        try {
//            FileReader fr = new FileReader("abc.txt");
//            BufferedReader bf = new BufferedReader(fr);
//            bf.read();
//        } catch (Exception e)
//        {
//            System.out.println(e);
//        }
//        finally {
//            try {
//                bf.close();
//            }
//            catch (IOException e){
//                e.printStackTrace();
//            }
//        }

        //Try with resources
        
    }
}
