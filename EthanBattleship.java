package Battleship;

import java.util.Random;
import java.util.Scanner;

public class Board {

	private static int alphaToNumber(String alpha) {
		switch (alpha) {
		case "A":
			return 0;
		case "B":
			return 1;
		case "C":
			return 2;
		case "D":
			return 3;
		case "E":
			return 4;
		case "F":
			return 5;
		case "G":
			return 6;
		case "H":
			return 7;
		case "I":
			return 8;
		case "J":
			return 9;
		}
		return 0;

	}

	public static void main(String arg[]) {
		String[][] square = new String[10][10];

		int[][] blockMask = new int[3][];
		int[][] blockMaskB = new int[4][];
		int[][] blockMaskC = new int[5][];
		int[][] blockMaskD = new int[2][];
		int[][] blockMaskE = new int[3][];
		
		
		blockMask[0] = new int[] { 0, 0, 0 };
		blockMask[1] = new int[] { 1, 1, 1 };
		blockMask[2] = new int[] { 0, 0, 0 };
		
		blockMaskB[0] = new int[] {1,0};
		blockMaskB[1] = new int[] {1,0};
		blockMaskB[2] = new int[] {1,0};
		blockMaskB[3] = new int[] {1,0};
		
		blockMaskC[0] = new int[] {1,0};
		blockMaskC[1] = new int[] {1,0};
		blockMaskC[2] = new int[] {1,0};
		blockMaskC[3] = new int[] {1,0};
		blockMaskC[4] = new int[] {1,0};
		
		blockMaskD[0] = new int[] {1,1};
		blockMaskD[1] = new int[] {0,0};
		
		blockMaskE[0] = new int[] {1,0};
		blockMaskE[1] = new int[] {1,0};
		blockMaskE[2] = new int[] {1,0};
		
		initialiseBoard(square);
		maskedShape(square, blockMask);
		maskedShape(square, blockMaskB);
		maskedShape(square, blockMaskC);
		maskedShape(square, blockMaskD);
		maskedShape(square, blockMaskE);
		while (!checkwin (square)) {
			System.out.print("Enter co-ordinates Letter before Number:");

			Scanner in = new Scanner(System.in);

			String consoleInput = in.nextLine();
			String tempx = Character.toString(consoleInput.charAt(0))
					.toUpperCase();
			String tempy = Character.toString(consoleInput.charAt(1));
			int X = alphaToNumber(tempx);
			int Y = Integer.parseInt(tempy);

			if (square[Y][X] == "[**]") {
				System.out.println("Hit");
				square[Y][X] ="[HH]";
			}
			else {
				System.out.println("Miss");
				square[Y][X] ="[MM]";
			}
			printboard (square);
		}
	}
private static void initialiseBoard(String[][] square){	
	for (int x = 0; x < square.length; x++) {
		for (int y = 0; y < square[x].length; y++) {
			square[x][y] = "[00]";		
		}			
	}
}
	
	private static void maskedShape(String[][] square, int[][] blockMask) {


		for (int x = 0; x < blockMask.length; x++) {
			for (int y = 0; y < blockMask[blockMask.length - 1].length; y++) {
				System.out.print(blockMask[x][y]);
			}
			System.out.println();
		}

		int xPoint = randomBetween(0, square.length - blockMask[0].length);
		int yPoint = randomBetween(0,
				square[square.length - blockMask.length].length
						- blockMask[0].length);

		System.out.println("Insert block");
		
		for (int x = xPoint; x < square.length; x++) {
			for (int y = yPoint; y < square[x].length; y++) {
				if (xPoint == x && yPoint == y) {
					for (int i = 0; i < blockMask.length; i++) {
						for (int j = 0; j < blockMask[i].length; j++) {
							if (blockMask[i][j] == 1) {
								square[x + i][y + j] = "[**]";
							}
						}
					}
				}
			}
		}

 printboard (square);

	}
	private static void printboard (String[][] square) {
		System.out.println("...A...B...C...D...E...F...G...H...I...J..");
		System.out.println();
		for (int x = 0; x < square.length; x++) {
			System.out.print(x);
			for (int y = 0; y < square[x].length; y++) {
			if (square[x][y]=="[HH]" ||square[x][y]=="[MM]") 	System.out.print(square[x][y]);
			else System.out.print("[00]");
			}
			System.out.println();
		}
	}

	private static void addShape() {

		int[][] blockMask = new int[4][];

		blockMask[0] = new int[] { 0, 0 };
		blockMask[1] = new int[] { 0, 1 };
		blockMask[2] = new int[] { 1, 1 };
		blockMask[3] = new int[] { 1, 0 };

		for (int x = 0; x < blockMask.length; x++) {
			for (int y = 0; y < blockMask[blockMask.length - 1].length; y++) {
				System.out.print(blockMask[x][y]);
			}
			System.out.println();
		}

		String[][] square = new String[10][10];


		int xPoint = randomBetween(0, square.length - 1);
		int yPoint = randomBetween(0, square[square.length - 1].length - 1);

		System.out.println("x = " + xPoint);
		System.out.println("y = " + yPoint);

		for (int x = 0; x < square.length; x++) {
			for (int y = 0; y < square[x].length; y++) {
				square[x][y] = "[000]";
				System.out.print(square[x][y]);
			}
			System.out.println();
		}

		System.out.println("Insert block");

		for (int x = 0; x < square.length; x++) {
			for (int y = 0; y < square[x].length; y++) {
				if (xPoint == x && yPoint == y) {
					for (int i = 0; i < blockMask.length; i++) {
						for (int yb = 0; yb < blockMask[blockMask.length - 1].length; yb++) {
							square[x + blockMask[i][0]][y + blockMask[i][1]] = "[***]";
						}
					}
				}
			}
		}

		for (int x = 0; x < square.length; x++) {
			for (int y = 0; y < square[x].length; y++) {
				System.out.print(square[x][y]);
			}
			System.out.println();
		}

	}

	public static void randomStar() {

		String[][] square = new String[10][10];

		int xPoint = randomBetween(0, 9);
		int yPoint = randomBetween(0, 9);

		System.out.println("x = " + xPoint);
		System.out.println("y = " + yPoint);

		for (int y = 0; y < square.length; y++) {

			for (int x = 0; x < square[y].length; x++) {

				if (xPoint == x && yPoint == y) {
					square[x][y] = "[***]";
				} else {
					square[x][y] = "[" + x + "," + y + "]";
				}
				System.out.print(square[x][y]);
			}
			System.out.println();

		}
	}

	public static void fullSquare() {

		String[][] square = new String[10][10];


		for (int x = 0; x < square.length; x++) {
			for (int y = 0; y < square[x].length; y++) {
				square[x][y] = "[*]";
			}
		}

		for (int x = 0; x < square.length; x++) {
			for (int y = 0; y < square[x].length; y++) {
				System.out.print(square[x][y]);
			}
			System.out.println();
		}
	}
	
	private static boolean checkwin (String[][] board){
		for (int x = 0; x < board.length; x++) {
			for (int y = 0; y < board[x].length; y++) {
				if (board[x][y] =="[**]")
					return false;
			}
		}
		System.out.println("You sunk my fleet    You win");
		return true; 
	}


	private static int randomBetween(int min, int max) {

		Random rand = new Random();

		int num = rand.nextInt((max - min) + 1) + min;

		return num;
	}

}
