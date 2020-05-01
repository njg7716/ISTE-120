/*
Course: ISTE-120
Author: Nicholas Graca
Practical 3
Purpose: Test the Jack class
*/

import java.util.Scanner;

public class TestJack{
   
   public static void main(String[] args){
      //initialize some variables for when we ask for input
      Scanner in = new Scanner(System.in);
      String code;
      int roomNum;
      int jackNum;
      
      //Ask for building code and validate
      while(true){
         System.out.print("Building Code: ");
         code = in.nextLine();
         if(code.length() == 3){
            break;
         }
         else{
            System.out.println("Building Code must be 3 characters long.");
         }
      }
      
      //Ask for room number and validate
      while(true){
         System.out.print("Room Number: ");
         roomNum = in.nextInt();
         if(roomNum >= 1 && roomNum <= 99999){
            break;
         }  
         else{
            System.out.println("Room Number must be between 1 and 99999, inclusive.");
         }
      }
      
      //Ask for Jack Number and validate
      while(true){
         System.out.print("Jack Number: ");
         jackNum = in.nextInt();
         if(jackNum >= 1 && jackNum <= 24){
            break;
         }  
         else{
            System.out.println("Jack Number must be between 1 and 24, inclusive.");
         }
      }
      //create jack1
      Jack jack1 = new Jack(code, roomNum, jackNum);
      in.nextLine();
      String type;
      
      //Ask for type of jack1 and validate
      while(true){
         System.out.print("Jack Type: ");
         type = in.nextLine().toUpperCase();
         if (type.equals("ENET") || type.equals("PH") || type.equals("VID")){
            break;
         }
         else{
            System.out.println("Jack Type must be ENET, PH, or VID.");
         }
      }
      //Level 1
      
      //Set jack type for jack 1
      jack1.setJackType(type);
      System.out.printf("%s:%d:%02d is of type %s%n%n", jack1.getBuildingCode(), jack1.getRoomNumber(), jack1.getJackNumber(), jack1.getJackType());
      
      //Level 2
      
      //create jack2 with level2 constructor
      Jack jack2 = new Jack("TEC:456:02");
      jack2.setJackType("VID");
      System.out.printf("Jack2 using accessors - %s is of type %s%n", jack2.getBuildingCode() + ":" + String.valueOf(jack2.getRoomNumber()) + ":" + String.format("%02d", jack2.getJackNumber()), jack2.getJackType());
      System.out.printf("Jack2 using virtual accessor - %s%n%n", jack2.getJackIdentifier());
   
      //Level 3
      
      //create jack3 with level 3 constructor
      Jack jack3 = new Jack("MFG:567:03", 10);
      jack3.setJackType("PH");
      System.out.println("Enter additional information items for Jack3");
      
      //ask for amount of info items
      System.out.print("How many info items? ");
      int amount = in.nextInt();
      in.nextLine();
      
      //loop through asking for lines of info based on the amount the user said
      for (int i = 0; i < amount; i++){
         System.out.printf("Enter one line of information:%n");
         String information = in.nextLine();
         //If user enters end of information then just stop asking for information
         if (information.equals("End of Information")){
            //add information into the info array
            jack3.setInfo(information, i);
            break;
         }
         jack3.setInfo(information, i);
      }
      System.out.printf("Jack3 using accessors - %s is of type %s%n", jack3.getBuildingCode() + ":" + String.valueOf(jack3.getRoomNumber()) + ":" + String.format("%02d", jack3.getJackNumber()), jack3.getJackType());
      System.out.printf("Jack3 using virtual accessor - %s%n", jack3.getJackIdentifier());
      System.out.println("Jack3 Info:");
      
      //loop through the info array and print the information
      for (int i = 0; i < amount; i++){
         System.out.printf("\t%s%n", jack3.getInfo(i));
      }
   }

}