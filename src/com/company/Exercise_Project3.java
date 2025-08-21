package com.company;

import java.util.Scanner;



class Game {
        boolean isCorrectNumber;
        int numberGuessed;
        int noOfGuesses;
        int randomNumber;


        public Game() {
            this.randomNumber = (int) (Math.random() * 101);
        }

        public int takeUserInput() {
            System.out.print("Enter your guess:- ");
            Scanner sc = new Scanner(System.in);
            numberGuessed = sc.nextInt();
            return numberGuessed;

        }

        public void IsCorrectNumber() {
            while (true) {
                if (numberGuessed > randomNumber) {
                    System.out.println("it's higher than guessed number! Try again.");
                    noOfGuesses++;
                    takeUserInput();
                } else if (numberGuessed < randomNumber) {
                    System.out.println("it's lower than guessed number! Try again.");
                    noOfGuesses++;
                    takeUserInput();
                } else if (numberGuessed == randomNumber) {
                    System.out.println(" Yes, you got that right! You WON.");
                    break;
                }

            }

            noOfGuesses++;
        }

        public int getNoOfGuesses() {
           return noOfGuesses;
        }

    }


    public class Exercise_Project3 {
    public static void main(String[] args) {

        System.out.println("welcome to game of GUESS-MY-NUMBER");
        System.out.println("RULES :- 1. Computer will generate a random number between 1 to 100.\n" );
        System.out.println("         2. You will have to guess the number.\n");
        System.out.println("         3. Your guess will be higher or lower than the generated number.\n");
        System.out.println("         4. Your number of guesses will be counted and it will be shown at the end of GAME.\n");

        Game g = new Game();
        g.takeUserInput();
        g.IsCorrectNumber();
        System.out.println("The number of guesses you've taken are : " + g.getNoOfGuesses());





    }
}
