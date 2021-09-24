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


        int startPosition = 0;
        int winPosition = 100;
        System.out.println("Player position is " + startPosition);

        while (startPosition < winPosition) {
            //random function to get dice number
            int diceNum = (int) Math.floor(((Math.random() * 10) % 6) + 1);
            System.out.println("dice number is" + diceNum);
            //logic to get whether it snake or ladder or no play
            int option = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println("option is" + option);
            switch (option) {
                case 1:
                    option = LADDER;
                    startPosition += diceNum;
                    break;
                case 2:
                    option = SNAKE;
                    startPosition -= diceNum;
                    break;
                default:
                    option = NOPLAY;
                    startPosition += 0;

                    if (startPosition < 0) {
                        System.out.println("Restart the game");
                        startPosition = 0;

                    }
            }
        }

        System.out.println("player on position :" + winPosition);
        System.out.println("won the match");
    }
}