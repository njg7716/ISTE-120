/*
Course: ISTE-120
Author: Nicholas Graca
HW12
Purpose: Interface for the different employee types
*/


public interface Company{

   //Constants:
   public static final String NAME = "Super Employer Inc.";
   public static final String ADDRESS = "Rochester, NY";
   public static final int WEEKS = 52;
   
   //for Hourly its the hourly rate for salaried its the annual ray. Takes in a double and returns nothing
   public void setPay(double d);
   
   //Calculates the annual pay of the employee. Takes in nothing and returns a double
   public double calcAnnualPay();
   
   //calculates the weekly pay of the employee. Takes in nothing and returns a double
   public double calcWeeklyPay();
   
}