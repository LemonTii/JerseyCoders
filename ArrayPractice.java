package com.jerseycoders.arrays;

import java.util.Random;

/**
 * Created by atheedom on 06/05/15.
 */
public class ArrayPractice {

    public static void main(String... args) {

        // fullSquare();
        // randomBetween(10, 30);
        // randomStar();
        // addShape();
        // maskedShape();

    }

   // Note: this code is buggy and can throw an indexOutOfBoundsException
   private static void maskedShape() {

        int[][] blockMask = new int[3][];

        blockMask[0] = new int[]{0,0,1};
        blockMask[1] = new int[]{1,1,1};
        blockMask[2] = new int[]{0,0,1};

        for (int x = 0; x < blockMask.length; x++) {
            for (int y = 0; y < blockMask[blockMask.length - 1].length; y++) {
                System.out.print(blockMask[x][y]);
            }
            System.out.println();
        }

        // Define 2d array and 1st dimension
        String[][] square = new String[10][];

        // Define 2nd dimension;
        int yDim = 5;
        square[0] = new String[yDim];
        square[1] = new String[yDim];
        square[2] = new String[yDim];
        square[3] = new String[yDim];
        square[4] = new String[yDim];
        square[5] = new String[yDim];
        square[6] = new String[yDim];
        square[7] = new String[yDim];
        square[8] = new String[yDim];
        square[9] = new String[yDim];

        // Choose random x, y location in array
        int xPoint = randomBetween(0, square.length - 1);
        int yPoint = randomBetween(0, square[square.length - 1].length - 1);

        // Print out x and y coords
        System.out.println("x = " + xPoint);
        System.out.println("y = " + yPoint);

        // Fill Array
        for (int x = 0; x < square.length; x++) {
            for (int y = 0; y < square[x].length; y++) {
                square[x][y] = "[00]";
                System.out.print(square[x][y]);
            }
            System.out.println();
        }

        System.out.println("Insert block");

        // insert block
        for (int x = 0; x < square.length; x++) {
            for (int y = 0; y < square[x].length; y++) {
                if (xPoint == x && yPoint == y) {
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 3; j++) {
                            if(blockMask[i][j] == 1){
                                square[x + i][y + j] = "[**]";
                            }
                        }
                    }
                }
            }
        }

        // Print Array
        for (int x = 0; x < square.length; x++) {
            for (int y = 0; y < square[x].length; y++) {
                System.out.print(square[x][y]);
            }
            System.out.println();
        }



    }

    private static void addShape() {

        /*

        [***][***]
        [***][***]

         */


        int[][] blockMask = new int[4][];

        blockMask[0] = new int[]{0,0};
        blockMask[1] = new int[]{0,1};
        blockMask[2] = new int[]{1,1};
        blockMask[3] = new int[]{1,0};

        for (int x = 0; x < blockMask.length; x++) {
            for (int y = 0; y < blockMask[blockMask.length - 1].length; y++) {
                System.out.print(blockMask[x][y]);
            }
            System.out.println();
        }

        // Define 2d array and 1st dimension
        String[][] square = new String[10][];

        // Define 2nd dimension;
        int yDim = 5;
        square[0] = new String[yDim];
        square[1] = new String[yDim];
        square[2] = new String[yDim];
        square[3] = new String[yDim];
        square[4] = new String[yDim];
        square[5] = new String[yDim];
        square[6] = new String[yDim];
        square[7] = new String[yDim];
        square[8] = new String[yDim];
        square[9] = new String[yDim];

        // Choose random x, y location in array
        int xPoint = randomBetween(0, square.length - 1);
        int yPoint = randomBetween(0, square[square.length - 1].length - 1);

        // Print out x and y coords
        System.out.println("x = " + xPoint);
        System.out.println("y = " + yPoint);

        // Fill Array
        for (int x = 0; x < square.length; x++) {
            for (int y = 0; y < square[x].length; y++) {
                square[x][y] = "[000]";
                System.out.print(square[x][y]);
            }
            System.out.println();
        }

        System.out.println("Insert block");

        // insert block
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

        // Print Array
        for (int x = 0; x < square.length; x++) {
            for (int y = 0; y < square[x].length; y++) {
                System.out.print(square[x][y]);
            }
            System.out.println();
        }


    }


    public static void randomStar() {

        // Define 2d array and 1st dimension
        String[][] square = new String[10][];

        // Define 2nd dimension;
        square[0] = new String[10];
        square[1] = new String[10];
        square[2] = new String[10];
        square[3] = new String[10];
        square[4] = new String[10];
        square[5] = new String[10];
        square[6] = new String[10];
        square[7] = new String[10];
        square[8] = new String[10];
        square[9] = new String[10];

        // Choose random x, y location in array
        int xPoint = randomBetween(0, 9);
        int yPoint = randomBetween(0, 9);

        // Print out x and y coords
        System.out.println("x = " + xPoint);
        System.out.println("y = " + yPoint);

        // Fill Array
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

        square[0] = new String[10];
        square[1] = new String[10];
        square[2] = new String[10];
        square[3] = new String[10];
        square[4] = new String[10];
        square[5] = new String[10];
        square[6] = new String[10];
        square[7] = new String[10];
        square[8] = new String[10];
        square[9] = new String[10];

        // Fill Array
        for (int x = 0; x < square.length; x++) {
            for (int y = 0; y < square[x].length; y++) {
                square[x][y] = "[*]";
            }
        }

        // Print Array
        for (int x = 0; x < square.length; x++) {
            for (int y = 0; y < square[x].length; y++) {
                System.out.print(square[x][y]);
            }
            System.out.println();
        }
    }

    /**
     * Generates a random number between min and max.
     *
     * @param min min number
     * @param max max number
     * @return a random integer
     */
    private static int randomBetween(int min, int max) {

        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int num = rand.nextInt((max - min) + 1) + min;
        // System.out.println(num);

        return num;
    }

}
