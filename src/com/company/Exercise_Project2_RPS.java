package com.company;

import java.util.Scanner;

public class Exercise_Project2_RPS {
    public static void main(String[] args) {

        System.out.println("Welcome to the game of Rock, Paper, Scissors.");
        System.out.println("According to our rule and for your help we assigned the numbers to rock, paper and scissors.\nRock = 1\nPaper = 2\nScissors = 3\n");


        int Rock = 1;
        int Paper = 2;
        int Scissors = 3;


        System.out.print("Enter your choice :- ");
        Scanner sc = new Scanner(System.in);
        int userChoice = sc.nextInt();;

        int computerChoice = (int) (Math.random() * 3 + 1);
        System.out.print("Computer choice is :- " + computerChoice + "\n");

        if (userChoice == computerChoice) {
            System.out.println("The game is draw!");
        }
        else if (userChoice == 1 && computerChoice == 2 || userChoice == 2 && computerChoice == 3 || userChoice == 3 && computerChoice == 1) {
            System.out.println("Sorry! the Computer won the game, and you lose.");
        } else {
            System.out.println("Congratulations! You Won the game and Computer lose.");
        }

           main(new String[]{}); // for infinite loop OR to continue the game
        
    }
}
