package java_revamp.day_3;
import java.util.Random;

public class TwoDimnArray_3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int m = 3, n = 4;
        int[][] a = new int[m][n];

        // Filling the 2D array with random numbers
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = rand.nextInt(10); // Random number between 0 and 9
            }
        }

        // Printing the 2D array
        System.out.println("2D Array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        a = new int[][] {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        System.out.println("Initialized 2D Array:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
