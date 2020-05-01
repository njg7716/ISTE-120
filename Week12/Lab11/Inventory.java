/*
Course: ISTE-120
Author: Nicholas Graca
Lab11
Purpose: To follow the instructions
*/

import java.util.ArrayList;

public class Inventory{
   public static void main(String[] args){
         ArrayList<Boat> inventory = new ArrayList<Boat>();
         PowerBoat b1 = new PowerBoat("blue", 22, 60);
         SailBoat b2 = new SailBoat("white", 18, 1);
         SailBoat b3 = new SailBoat("red", 42, 3);
         PowerBoat b4 = new PowerBoat("yellow", 35, 80);
         PowerBoat b5 = new PowerBoat("red", 50, 120);
         SailBoat b6 = new SailBoat("blue", 33, 2);
         PowerBoat b7 = new PowerBoat("white", 14, 10);
         inventory.add(b1);
         inventory.add(b2);
         inventory.add(b3);
         inventory.add(b4);
         inventory.add(b5);
         inventory.add(b6);
         inventory.add(b7);
         System.out.println("Printing all boats:\n");
         int tot = 0;
         Boat max = inventory.get(0);
         for(Boat b : inventory){
            System.out.println(b.toString());
            tot += b.calcPrice();
            if(b.calcPrice() > max.calcPrice()){
               max = b;
            }
         }
         System.out.println();
         System.out.printf("Total price of all boats is $%,.2f\n", Double.valueOf(tot));
         System.out.printf("\nMost Expensive Boat: %s", max.toString());
   }
}