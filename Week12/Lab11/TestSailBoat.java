/*
Course: ISTE-120
Author: Nicholas Graca
Lab11
Purpose: To follow the instructions
*/

public class TestSailBoat{
   
   public static void main(String[] args){
      SailBoat sb = new SailBoat("red", 25, 2);
      System.out.printf("Sailboat:%n%s%n%n", sb.toString());
      System.out.println("Changing Sailboat's color to purple.");
      if(!sb.setColor("purple")){
         System.out.println("Error: Boats can only be white, red, blue, or yellow.");
      }
      System.out.println();
      System.out.println();
      System.out.println("Changing Sailboat's length to 55.");
      if(!sb.setLength(55)){
         System.out.println("Error: Boats can only be between 20 and 50 feet, inclusively.");
      }
   }
}