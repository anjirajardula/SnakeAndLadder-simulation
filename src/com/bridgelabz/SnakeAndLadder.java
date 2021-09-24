package com.bridgelabz;

/**
 * purpose- To implement Snake And Ladder simulation using JAVA
 *
 * @author :Anjiraj
 * @version :16.0
 * @since :23/09/2021
 */

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to the snake and ladder program");
        // constants
        int LADDER = 1;
        int SNAKE = 2;
        int NOPLAY = 0;

//variable declaration
        int startPosition = 0;
        int newPosition = 0;
        int winPosition = 100;
        int count = 0;

        while (startPosition < winPosition) {
            //random function to get dice number
            int diceNum = (int) Math.floor(((Math.random() * 10) % 6) + 1);
            System.out.println("dice number is" + diceNum);
            //logic to get whether it snake or ladder or no play
            int option = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println("option is" + option);
            count++;

            switch (option) {
                case 1:
                    option = LADDER;
                    newPosition += diceNum;
                    break;
                case 2:
                    option = SNAKE;
                    newPosition -= diceNum;
                    break;
                default:
                    option = NOPLAY;
                    newPosition += 0;
            }

            startPosition = startPosition + newPosition; //calculating the position of the dice

            if (startPosition < 0) {
                System.out.println("Restart the game");
                startPosition = 0;


            }
            if (startPosition > 100) {
                System.out.println("you are now at " + startPosition + "th" + " position");

            }
            System.out.println("\nCongratulation .. you won! the game \t after the rolling the die " + count + " position");


        }


    }
}