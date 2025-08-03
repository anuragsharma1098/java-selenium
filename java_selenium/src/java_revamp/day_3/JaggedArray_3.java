package java_revamp.day_3;

import java.util.Random;
//import java.util.Scanner;

public class JaggedArray_3 {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        // Example of a jagged array
        int[][] jaggedArray = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
        // Example of a dynamic jagged array
        System.out.println();
        System.out.println("Dynamic Jagged Array:");
        System.out.println("Enter the number of rows for the dynamic jagged array:");
        int r=rand.nextInt(10);
        // Random number of rows between 0 and 9
        System.out.println("Number of rows: " + r);
        int[][] dynamicJaggedArray = new int[r][];
        for(int i = 0; i < r; i++){
            System.out.println("Enter the number of columns for the dynamic jagged array:");
            int c = rand.nextInt(10);
            System.out.println("Number of columns in row " + i + ": " + c);
            // Initialize each row with a random number of columns
            dynamicJaggedArray[i] = new int[c];
        }
        // Filling the dynamic jagged array with random numbers
        System.out.println();
        System.out.println("Enter the elements for the dynamic jagged array:");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < dynamicJaggedArray[i].length; j++){
                System.out.print("Element at row " + i + ", column " + j + ": ");
                dynamicJaggedArray[i][j] = rand.nextInt(10);
                System.out.println(dynamicJaggedArray[i][j]);
            }
        }
        // Printing the dynamic jagged array
        System.out.println();
        System.out.println("Dynamic Jagged Array:");
        System.out.println();
        for (int i = 0; i < dynamicJaggedArray.length; i++) {
            for (int j = 0; j < dynamicJaggedArray[i].length; j++) {
                System.out.print(dynamicJaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
