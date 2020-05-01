/*
Nicholas Graca
ISTE-120
HW9
Simulates tossing a Coin
*/

import java.util.Scanner;
public class CoinToss{
   private int tosses;
   private char[] data;
   private int heads;
   private int tails;
   private int max;
   private char maxSide;

   public CoinToss(int num){
      tosses = num;
      data = new char[tosses];
   }
   
   public void toss(){
      for(int i = 0; i < tosses; i++){
         if(Math.random() < .5){
            data[i] = 'h';
            heads += 1;
         }
         else{
            data[i] = 't';
            tails += 1;
         }
      }
   }
   
   public int getHeads(){
      return heads;
   }
   
   public int getTails(){
      return tails;
   }
   public int getTosses(){
      return tosses;
   }
   public int getMaxNum(){
      longestRun();
      return max;
   }
   public char getMaxSide(){
      longestRun();
      return maxSide;
   }
   public void longestRun(){
      char side = 'x';
      int len = 0;
      for(int i = 0; i < tosses; i++){
         if(side == data[i]){
            len++;
         }
         else{
            if(len > max){
               max = len;
               maxSide = side;
            }
            side = data[i];
            len = 0;
         }
      }
   }
}