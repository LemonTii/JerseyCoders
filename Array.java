package d;

import java.util.Random;

public class Array {

    private static int randomBetween(int min, int max) {

        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int num = rand.nextInt((max - min) + 1) + min;
        // System.out.println(num);

        return num;
    }


    public static void main(String[] args) {

        int x = randomBetween(0, 9);
        int y = randomBetween(0, 9);

        String[][] square = new String[10][];

        for (int i = 0; i < 10; i++) {
            square[i] = new String[10];
            for (int j = 0; j < 10; j++) {
                square[i][j] = "*";
                System.out.print(square[i][j]);
            }
            System.out.println();
        }

        square[x][y] = "O";
        System.out.println();
        System.out.println();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(square[i][j]);
            }
            System.out.println();
        }

        System.out.print(x);
        System.out.print(y);
    }

}
