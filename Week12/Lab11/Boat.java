/*
Course: ISTE-120
Author: Nicholas Graca
Lab11
Purpose: To follow the instructions
*/

public class Boat{
   private String color;
   private int length;
   
   public Boat(){
      color = "white";
      length = 20;
   }
   
   public Boat(String col, int len){
      setColor(col);
      setLength(len);
   }
   
   public boolean setColor(String col){
      if(col.equals("white") || col.equals("red") || col.equals("blue") || col.equals("yellow")){
         color = col;
         return true;
      }
      else{
         return false;
      }
   }
   
   public boolean setLength(int len){
      if(len >= 20 && len <= 50){
         length = len;
         return true;
      }
      else{
         return false;
      }
   }
   public int calcPrice(){return 0;}
   public String getColor(){return color;}
   public int getLength(){return length;}
   
   public String toString(){
      return String.format("Color = %-5s\t\tLength = %d", color, length);
   }

   
}