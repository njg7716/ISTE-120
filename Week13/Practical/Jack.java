/*
Course: ISTE-120
Author: Nicholas Graca
Practical 3
Purpose: A Jack class to test us on Java things that we have leaned
*/

public class Jack{
   private String buildingCode;
   private String jackType;
   private int roomNumber;
   private int jackNumber;
   private String[] info;
   
   //Default Constructor
   public Jack(){
      buildingCode = "???";
      jackType = "";
      roomNumber = 0;
      jackNumber = 0;
      info = new String[1];
   }
   
   //Constructor for Level 1
   public Jack(String code, int roomNum, int jackNum){
      buildingCode = code;
      jackType = "ENET";
      roomNumber = roomNum;
      jackNumber = jackNum;
      info = new String[1];
   }
   
   //Constructor for Level 2
   public Jack(String id){
      String[] parts = id.split(":"); 
      buildingCode = parts[0];
      jackType = "ENET";
      roomNumber = Integer.parseInt(parts[1]);
      jackNumber = Integer.parseInt(parts[2]);
      info = new String[1];
   }
   
   //Constructor for Level 3
   public Jack(String id, int infoSize){
      String[] parts = id.split(":"); 
      buildingCode = parts[0];
      jackType = "ENET";
      roomNumber = Integer.parseInt(parts[1]);
      jackNumber = Integer.parseInt(parts[2]);
      info = new String[infoSize];
   }
   
   //All of the getters
   public String getBuildingCode(){return buildingCode;}
   public String getJackType(){return jackType;}
   public int getRoomNumber(){return roomNumber;}
   public int getJackNumber(){return jackNumber;}
   public String getJackIdentifier(){return buildingCode + ":" + String.valueOf(roomNumber) + ":" + String.format("%02d", jackNumber);}
   public int getInfoSize(){return info.length;}
   public String getInfo(int num){return info[num];}
   
   //all of the setters
   public void setBuildingCOde(String code){buildingCode = code;}
   public void setJackType(String type){jackType = type;}
   public void setRoomNumber(int num){roomNumber = num;}
   public void setJackNumber(int num){jackNumber = num;}
   public void setInfo(String i, int num){info[num] = i;}
   
}