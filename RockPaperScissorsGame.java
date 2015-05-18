package com.examples;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by atheedom on 14/05/15.
 */
public class RockPaperScissorsGame {

    public static void main(String[] args) {

        while (true) {

            // Set up move options and print to console
            System.out.println("Enter your move:");
            System.out.println("0 - Rock");
            System.out.println("1 - Paper");
            System.out.println("2 - Scissors");
            System.out.println("x - to exit");

            // Wait for player to make move;
            System.out.print("Enter your move:");
            //String consoleInput = System.console().readLine();

            Scanner in = new Scanner(System.in);

            // Reads a single line from the console
            // and stores into name variable
            String consoleInput = in.nextLine();

            // If x is chosen then exit
            if (consoleInput.equals("x")) {
                System.exit(0);
            }

            // Convert console input to int
            int playerMove = Integer.parseInt(consoleInput);

            // Computer makes its move
            int computerMove = randomBetween(0, 2);

            // Rock = 0
            // Paper = 1
            // Scissors = 2

            // Print out some space
            System.out.println("");
            System.out.println("");

            // Print out player's move
            switch (playerMove) {
                case 0:
                    System.out.println("Player's move: Rock");
                    break;
                case 1:
                    System.out.println("Player's move: Paper");
                    break;
                case 2:
                    System.out.println("Player's move: Scissors");
                    break;
            }

            // Print out computers move
            switch (computerMove) {
                case 0:
                    System.out.println("Computer's move: Rock");
                    break;
                case 1:
                    System.out.println("Computer's move: Paper");
                    break;
                case 2:
                    System.out.println("Computer's move: Scissors");
                    break;
            }



            // Rules

            // If same draw
            if (playerMove == computerMove) {
                System.out.println("Draw");
            } else if (playerMove == 0 && computerMove == 2) {
                // Rock beats Scissors
                System.out.println("You Win");
            } else if (playerMove == 2 && computerMove == 1) {
                // Scissors beats paper
                System.out.println("You Win");
            } else if (playerMove == 1 && computerMove == 0) {
                // Paper beats rock
                System.out.println("You Win");
            } else {
                System.out.println("Sorry you lose");
            }

            System.out.println("");
            System.out.println("");

        }
    }


    private static int randomBetween(int min, int max) {

        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int num = rand.nextInt((max - min) + 1) + min;
        // System.out.println(num);

        return num;
    }


}
