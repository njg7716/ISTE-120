/*
Course: ISTE-120
Author: Nicholas Graca
Lab11
Purpose: To follow the instructions
*/

public class PowerBoat extends Boat{
   private int engineSize;
   
   public PowerBoat(){
      super();
      engineSize = 5;
   }
   
   public PowerBoat(String col, int len, int size){
      super();
      super.setColor(col);
      super.setLength(len);
      setEngineSize(size);
   }
   
   public boolean setEngineSize(int size){
      if(size >= 5 && size <= 350){
         engineSize = size;
         return true;
      }
      else{
         return false;
      }
   }
   
   public int getEngineSize(){return engineSize;}
   
   public int calcPrice(){
      return 5000 + super.getLength() * 300 + engineSize * 20;
   }
   
   public String toString(){
      return super.toString() + String.format("\t\tEngine Size = %d\t\t\tCost = $%,.2f", engineSize, Double.valueOf(calcPrice()));
   }
}