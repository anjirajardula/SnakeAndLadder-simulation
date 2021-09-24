package com.bridgelabz;

/**
 * purpose- To implement Snake And Ladder simulation using JAVA
 * declaring the logics for die position , win the position and play for 2
 *
 * @author :Anjiraj
 * @version :16.0
 * @since :23/09/2021
 */

/**
 *
 */
public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake And Ladder Game.");

        //constants
        int LADDER = 1;
        int SNAKE = 2;
        int NO_PLAY = 0;

//variable decleration
        int startPosition = 0;
        int newPosition = 0;
        int winPosition = 100;
        System.out.println("The player position is " + startPosition);

        while (startPosition < winPosition) {


            //random function to get dice number
            int diceNum = (int) Math.floor(((Math.random() * 10) % 6) + 1); //to get number b/w 1to6
            System.out.println("The Dice  number is = " + diceNum);

            //logic to know whether it snake & ladder & no play

            int option = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println("The option is " + option);

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
                    option = NO_PLAY;
                    newPosition += 0;
            }
            startPosition = startPosition + newPosition; //calculating the position of the dice

            if (startPosition < 0) {
                System.out.println("Restart the game");
                startPosition = 0;
            }
            if (startPosition > 100) {
                startPosition = newPosition;
            }

            System.out.println("You are now at " + startPosition + "th" + " position");
        }
        //System.out.println("The player on position: " + winPosition);
        System.out.println("Won the Match");
    }
}



