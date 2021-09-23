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

        // variables
        double forwardStep, backwardStep;
        int startPosition = 0;
        System.out.println("Player position is " + startPosition);

        //logic to get dice number
        double diceNum = Math.floor(((Math.random() * 10) % 6) + 1);
        System.out.println("Dice number is = " + diceNum);

        //logic to know whether it snakes & ladder or no play
        double option = Math.floor(Math.random() * 10) % 3;
        System.out.println("option is" + option);

        //if condition for the result
        if (option == LADDER) {
            forwardStep = (diceNum + startPosition);
            System.out.println("the player will move the forward positions" + forwardStep);
        } else if (option == SNAKE) {
            backwardStep = (diceNum - startPosition);
            System.out.println("the player will move the backward positions" + backwardStep);
        } else
            System.out.println("there is no play and player will stay at the same position");


    }

}
