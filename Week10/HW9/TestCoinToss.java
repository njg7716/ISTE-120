/*
Nicholas Graca
ISTE-120
HW9
Tests CoinToss.java
*/
import java.util.Scanner;

public class TestCoinToss{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int tosses = 0;
      while(true){
         while(true){
            System.out.print("Enter integer number ( >= 2 ) coin tosses or 0 to Exit: ");
            tosses = in.nextInt();
            if(tosses == 0){
               System.exit(0);
            }
            else if(tosses < 2){
               System.out.println("Try again and follow the instructions this time.");
               continue;
            }
            else{
               break;
            }
         }
         CoinToss coin = new CoinToss(tosses);
         coin.toss();
         System.out.println();
         System.out.printf("Number of Coin Tosses: %d%n", coin.getTosses());
         System.out.printf("Fraction of Heads = %1.3f%n", (double)coin.getHeads()/(double)coin.getTosses());
         System.out.printf("Fraction of Tails = %1.3f%n", (double)coin.getTails()/(double)coin.getTosses());
         String side = null;
         if(coin.getMaxSide() == 'h'){
            side = "heads";
         }
         else{
            side = "tails";
         }
         System.out.printf("Longest run is %d %s%n", coin.getMaxNum(), side);
      }
   }   
}