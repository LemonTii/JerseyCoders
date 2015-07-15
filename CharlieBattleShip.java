package battleship;

import java.util.Random;
import java.util.Scanner;

public class CharlieBattleShip.java {

	public static void main(String... args) {
		String[][] square = new String[10][10];

		int a;
		int b;
		int hits = 0;
		int computerHits = 0;

		// Computer draws own board
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				square[i][j] = "*";
			}
		}

		// Computer puts ships on board
		for (int i = 0; i < 1; i++) {

			// choose random number between 0 and 1
			int c = randomBetween(0, 1);
			// if 1 then do horizontal
			if (c == 1) {
				a = randomBetween(0, 7);
				b = randomBetween(0, 9);

				square[a][b] = "+";
				square[a + 1][b] = "+";
				square[a + 2][b] = "+";

				// else do vertical
			} else {
				a = randomBetween(0, 9);
				b = randomBetween(0, 7);

				square[a][b] = "+";
				square[a][b + 1] = "+";
				square[a][b + 2] = "+";
			}

			// a = randomBetween(0, 7);
			// b = randomBetween(0, 9);
			//
			// square[a][b] = "+";
			// square[a + 1][b] = "+";
			// square[a + 2][b] = "+";
			//
			// a = randomBetween(0, 8);
			// b = randomBetween(0, 9);
			//
			// square[a][b] = "+";
			// square[a + 1][b] = "+";
			//
			// a = randomBetween(0, 6);
			// b = randomBetween(0, 9);
			//
			// square[a][b] = "+";
			// square[a + 1][b] = "+";
			// square[a + 2][b] = "+";
			// square[a + 3][b] = "+";
		}
		// for (int i = 0; i < 10; i++) {
		// for (int j = 0; j < 10; j++) {
		// System.out.print(square[i][j]);
		// }
		//
		// System.out.println();
		// }

		// create 2d array
		String[][] playerSquare = new String[10][10];
		// Ask for players ships coords
		// ask for the x-coord and store in variable
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter x-coord for boat:");
			Scanner in = new Scanner(System.in);
			String x = in.nextLine();

			// ask for the y-coords and store in variable
			System.out.println("Enter y-coord for boat:");
			String y = in.nextLine();

			// create loop and ask for 5 sets of coords
			int gg;
			int jj;
			try {
				gg = Integer.parseInt(x);
				jj = Integer.parseInt(y);
			} catch (NumberFormatException e) {
				System.out.println("oops not a number");
				continue;
			}
			
			if (gg > 9 || gg < 0 || jj > 9 || jj < 0) {
				System.out.println("number out of range try another number");
				continue;
			}
			
			playerSquare[gg][jj] = "+";

			// store coords in 2d arrays
		}

		// game loop
		while (true) {

			// draws computers board
			for (int g = 0; g < 10; g++) {
				for (int j = 0; j < 10; j++) {
					if (square[g][j] == "h" || square[g][j] == "m") {
						System.out.print(square[g][j]);
					} else {
						System.out.print("0");
					}
				}
				System.out.println();
			}

			
			
			// ask for the x-coord and store in variable
			System.out.println("Enter x-coord:");
			Scanner in = new Scanner(System.in);
			String x = in.nextLine();

			// ask for the y-coords and store in variable
			System.out.println("Enter y-coord:");
			String y = in.nextLine();

			// convert x and y to integers
			int xx;
			int yy;
			try {
				xx = Integer.parseInt(x);
				yy = Integer.parseInt(y);
			} catch (NumberFormatException e) {
				System.out.println("oops not a number");
				continue;
			}

			if (xx > 9 || xx < 0 || yy > 9 || yy < 0) {
				System.out.println("number out of range try another number");
				continue;
			}

			// square[xx][yy] if this equals + then hit else miss
			if (square[xx][yy] == "+") {
				hits++;
				System.out.println("you have hit the boat!");
				square[xx][yy] = "h";
			} else {
				System.out.println("you have missed");
				square[xx][yy] = "m";
			}

			// if hit hits == 3 then you win, game over!
			if (hits == 3) {
				System.out.print("you destroyed the boat!");
				break;
			}

			// computer tries to guess players coords
			int playerX = randomBetween(0, 9);
			int playerY = randomBetween(0, 9);
			// computer chooses random x and random y

			// tests to see if x and y are a match for players coords
			// looking in the array
			
			String boat = playerSquare[playerX][playerY];
			
			if(boat != null){
				computerHits++;
				System.out.println("the computer has hit your boat");
				playerSquare[playerX][playerY] = "h";
			}
			else{
				System.out.println("the computer has missed your boat");
			}
			// if match then hit - increase computer score by one
			if(computerHits == 5){
				System.out.println("hahahahahaha you lose");
				break;
			}
			// if computer scores is equal to number of coords entered by player
			// then computer wins2
			
			for (int g = 0; g < 10; g++) {
				for (int j = 0; j < 10; j++) {
					if (playerSquare[g][j] == "+" || playerSquare[g][j] == "h") {
						System.out.print(playerSquare[g][j]);
					} else {
						System.out.print("0");
					}
				}
				System.out.println();
			}
			
			System.out.println("--------------------------");

		}

	}

	private static int randomBetween(int min, int max) {

		Random rand = new Random();

		int num = rand.nextInt((max - min) + 1) + min;

		return num;
	}

	public static void main1(String... args) {
		String[][] square = new String[10][10];

		int a;
		int b;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				square[i][j] = "*";
			}
		}
	}
}
