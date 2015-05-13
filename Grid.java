import java.util.Random;

public class Grid {

    public static void main(String arg[]) {

        String[][] grid = new String[10][];

        for (int i = 0; i < 10; i++) {
            grid[i] = new String[10];

            for (int j = 0; j < 10; j++) {
                grid[i][j] = "*";
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
        
        System.out.println();

        grid[(randomBetween(0, 9))][(randomBetween(0, 9))] = "h";
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
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
