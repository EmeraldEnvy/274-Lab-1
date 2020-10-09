/*
Author : Alexander Pham
Date : August 26, 2019
Description : User tries to guess the random number and is told the number of tries
 */

public class GuessingGame {
    public static void main(String[] args){
        int tries = 0;
        int userInput = 0;
        //Bounds for random number generator
        final int UPPERBOUND = 100;
        final int LOWERBOUND = 1;
        //Random number generator
        int randomNumber = (int) ((Math.random() * (UPPERBOUND - LOWERBOUND + 1 )) + LOWERBOUND);
        System.out.print("I'm thinking of a number. Guess a value (1-100): ");
        while ( userInput != randomNumber ){
            userInput = CheckInput.getInt();
            //Continuously asks user to try again if user enters out of range
            while ( userInput<1 || userInput>100 ){
                System.out.print( "Invalid, try again: " );
                userInput = CheckInput.getInt();
              }
            //Counts the number of guesses
            tries++;
            //Hints the user that their input is too low
            if ( userInput < randomNumber ){
                System.out.print( "Too Low. Guess again: " );
            }
            //Hints the user that their input is too high
            else if ( userInput > randomNumber ) {
                System.out.print( "Too High. Guess again: " );
            }
        }
        //User guesses the number. Program reports number of tries
        System.out.println( "Correct! You got it after " + tries + " tries." );
    }
}