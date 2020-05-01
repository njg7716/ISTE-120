/*
Course: ISTE-120
Author: Nicholas Graca
Lab11
Purpose: To follow the instructions
*/

public class SailBoat extends Boat{
   private int numSails;
   
   
   public SailBoat(){
      super();   
      numSails = 1;
   }
   
   public SailBoat(String col, int len, int num){
      super();
      super.setColor(col);
      super.setLength(len);
      setNumSails(num);
   }
   
   public boolean setNumSails(int num){
      if(num >= 1 && num <=4){
         numSails = num;
         return true;
      }
      else{
         return false;
      }
   }
   
   public int getNumSails(){return numSails;}
   
   public int calcPrice(){return (super.getLength() * 1000) + (numSails * 2000);}
   
   public String toString(){
      return super.toString() + String.format("\t\tNumber of Sails = %d\t\tCost = $%,.2f", numSails, Double.valueOf(calcPrice()));
   }
}