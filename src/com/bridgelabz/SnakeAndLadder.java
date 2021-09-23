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
        int startPosition = 0;
        System.out.println("Player position is" + startPosition);
        double diceNo = Math.floor(((Math.random()*10) %6) +1);
        System.out.println("Dice number is = " +diceNo);
    }

}
