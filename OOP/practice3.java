//making a very small guessing game "Guess the number"
import java.util.Random;
import java.util.Scanner;

public class practice3 {

//    Create a class Game, which allows a user to play "Guess the Number" game once.
//    Game should have the following methods:
//    Constructor to generate the random number
//    takeUserInput() to take a user input of number
//    isCorrectNumber() to detect whether the number entered by the user is true
//    getter and setter for noOfGuesses
//    Use properties such as noOfGuesses(int), etc to get this task done!

    public static void main(String[] args) {
            guessGame g = new guessGame();
            boolean b = false;
            while(!b){
                g.takeUserInput();
                b = g.isCorrect();
            }
    }

    static class guessGame{
        public int number;
        public int inputNumber;
        public int noOfGuess=0;

        public int getNoOfGuess(){
            return noOfGuess;
        }
        public void setNoOfGuess(int noOfGuess){
            this.noOfGuess = noOfGuess;
        }

        guessGame(){
            Random rand = new Random();
            this.number = rand.nextInt(0, 10);
        }
         void takeUserInput(){
             System.out.println("Guess the number...");
            Scanner input = new Scanner(System.in);
            this.inputNumber = input.nextInt();
         }
         boolean isCorrect(){
            this.noOfGuess++;
            if(this.number == this.inputNumber){
                System.out.format("You guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuess);
                return true;
            }
            else if (inputNumber<number){
                System.out.println("Too low...");
            }
            else if (inputNumber>number){
                System.out.println("Too high...");
            }
            return false;
         }
    }
}
