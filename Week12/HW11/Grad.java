/*
Course: ISTE-120
Author: Nicholas Graca
HW11
Purpose: Testing the Student class to learn about inheritence and extending classes
*/

public class Grad extends Student{
   private String researchArea;
   private final int COST = 713;
   
   //returns the research area of the grad
   public String getResearch(){return researchArea;}
   
   //allows the research are of the grad to be changed
   public void setResearch(String r){researchArea = r;}
   
   //creates the grad object
   public Grad(){
      setResearch("");
   }
   
   //calculates and returns the cost of tuition for the grad
   public double calcTuition(){
      return super.getCredits() * COST;
   }
   
   //Prints the info about the grad in the way the instructions told me to
   public String toString(){
      return "Grad Student:\n" + super.toString() + "\n\tResearch Area: " + researchArea + "\n\tTuition: \t\t$" + String.valueOf(calcTuition());
   }
}