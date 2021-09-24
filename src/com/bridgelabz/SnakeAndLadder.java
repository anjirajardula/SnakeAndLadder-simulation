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
    //declaring the  constant variable
    public static final int LADDER = 1;
    public static final int SNAKE = 2;
    public static final int NOPLAY = 0;


    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder program");
        //variable declaration
        int player1Position = 0;
        int player2Position = 0;
        int newPosition = 0;
        int currentPlayer = 1;
        int count1 = 0;
        int count2 = 0;
        int option;

        //declaring while loop condition for player1 $ player2 turns
        while (true) {
            //logic for player 1
            if (currentPlayer == 1) {
                System.out.println("now player 1 is turn");
                count1++;
                //random function to get dice number
                int diceNum = (int) Math.floor((Math.random() * 6) + 1);
                System.out.println("die number is = " + diceNum);
                option = (int) Math.floor((Math.random() * 3));
                System.out.println("option is =" + option);
                switch (option) {
                    case NOPLAY:
                        newPosition = 0;
                        break;
                    case LADDER:
                        newPosition = diceNum;
                        break;
                    case SNAKE:
                        newPosition = -diceNum;
                        break;
                }
                player1Position = player1Position + newPosition;
                if (player1Position > 100) {
                    player1Position = newPosition;
                }
                System.out.println("now Player-1 at " + player1Position + "th" + " Position");
                if (player1Position == 100) {
                    break;
                }
            } else {
                //logic for player 2
                count2++;
                System.out.println("Now Player-2's turn");
                int DieRolled = (int) (Math.random() * 6) + 1;
                option = (int) (Math.random() * 3);

                switch (option) {
                    case NOPLAY:
                        newPosition = 0;
                        break;
                    case LADDER:
                        newPosition = DieRolled;
                        break;
                    case SNAKE:
                        newPosition = -DieRolled;
                        break;
                }
                player2Position = player2Position + newPosition;
                if (player2Position < 0) {
                    player2Position = 0;
                }
                if (player2Position > 100) {
                    player2Position = newPosition;
                }
                System.out.println("Now Player-2 at " + player2Position + "th" + " Position");
                if (player2Position == 100) {
                    break;
                }
            }
            if (option == 1) {
                System.out.println("You got Ladder. Now play again.");
            } else {
                if (currentPlayer == 1) {
                    currentPlayer = 2;
                } else {
                    currentPlayer = 1;
                }
            }
        }
        if (player1Position == 100) {
            System.out.println("\nCongratulation Player-1 you won! \n after die Rolled" + count1 + " times.");
        } else {
            System.out.println("\nCongratulation Player-2 you won! \n after die Rolled" + count2 + " times.");

        }

    }
}




