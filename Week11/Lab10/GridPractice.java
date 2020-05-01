/*
Course: ISTE-120
Author: Jim Leone, Rayno Niemi, Nicholas Graca
Lab 10
Coronavirus Addition
*/

import java.util.Scanner;
import java.util.Random;

public class GridPractice  {
   public static void main(String[] args)  {
   //declarations
      Scanner in = new Scanner(System.in);
      Random  generator = new Random();
      int [][] grid;	//un-instantiated grid
      int size = 0;	//number of rows and columns
   
   //get size of grid - no validation & instantiate
      System.out.print("Enter size of grid: ");
      size = in.nextInt();
      grid = new int[size][size];
   
   //fill grid with random number from 1..99
      System.out.println();
      for (int row=0; row<size; row++)  {
         for (int col=0; col<size; col++)  {
            grid[row][col] = generator.nextInt(100); //random numbers 0.99 - not 100
         }
      }
   
   //STEP 3(exercise 1):  print grid with formatting to align
   	System.out.println();
      System.out.printf("Random values assigned to %s by %s grid %n", size, size);
      for(int r = 0; r < size; r++){
         for(int c = 0; c < size; c++){
            System.out.printf("  %2d", grid[r][c]);
         }
         System.out.println();
      }
   //STEP 4A (exercise 2): print each row sum
   System.out.printf("%nRow   Sum%n---------%n");
   for(int r = 0; r < size; r++){
      int tot = 0;
         for(int c = 0; c < size; c++){
            tot += grid[r][c];
         }
         System.out.printf("  %3d  %3d%n", r, tot);
   }
   //STEP 4B (exercise 2): print each column sum
   System.out.printf("%nCol   Sum%n---------%n");
   for(int c = 0; c < size; c++){
      int tot = 0;
         for(int r = 0; r < size; r++){
            tot += grid[r][c];
         }
         System.out.printf("  %3d  %3d%n", c, tot);
   }
   //STEP 5 (exercise 3): print two diagonal sums
   //top left to bottom right
   int tot = 0;
   for(int r = 0; r < size; r++){
      tot += grid[r][r];
   }
   System.out.println();
   System.out.println("Diagonal from upper left to lower right is " + tot);
   System.out.println();
   
   tot = 0;
   int c = size - 1;
   int r = 0;
   while(c >= 0){
      tot += grid[r][c];
      c--;
      r++;
   }
   System.out.println("Diagonal from upper right to lower left is " + tot);
   }
}