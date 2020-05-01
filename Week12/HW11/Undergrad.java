/*
Course: ISTE-120
Author: Nicholas Graca
HW11
Purpose: Testing the Student class to learn about inheritence and extending classes
*/

public class Undergrad extends Student{
   private int yearLevel;
   private final int COST = 517;
   
   //returns the undergrads year level
   public int getLevel(){return yearLevel;}
   
   //sets the year level for the undergrad
   public void setLevel(int level){yearLevel = level;}
   
   //Creates undergrad object given the name, id, credit number and year level
   public Undergrad(String n, String i, int c, int level){
      super(n, i, c);
      setLevel(level);
   }
   
   //returns the value of tution for the undergrade
   public double calcTuition(){
      return super.getCredits() * COST; 
   }
   
   //returns the string to print for the undergrad according to the instructions 
   public String toString(){
      return "Undergrad Student:\n" + super.toString() + "\n\tYear Level: \t" + String.valueOf(getLevel()) + "\n\tTuition: \t\t$" + String.valueOf(calcTuition());
   }
   
}