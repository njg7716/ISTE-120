/*
Course: ISTE-120
Author: Nicholas Graca
Lab11
Purpose: To follow the instructions
*/

public class TestPowerBoat{

   public static void main(String[] args){
      PowerBoat pb = new PowerBoat("yellow", 20, 20);
      System.out.printf("Powerboat:%n%s%n%n", pb.toString());
      System.out.println("Setting Power Boat's engine size to 500.");
      if(!pb.setEngineSize(500)){
         System.out.println("Error: That engine size must be between 5 and 350, inclusively.");
      }
   }
}