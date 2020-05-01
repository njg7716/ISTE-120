/*
Course: ISTE-120
Author: Nicholas Graca
HW12
Purpose: To follow the instructions
*/

public class Salaried implements Company{
   //Constant
   private static final double DEDUCTION = 125.50;
   
   //Name of employee
   private String name;
   //employees Social Security Number
   private String ssn;
   //Employees annual Salary before deductions
   private double annualSalary;
   
   //Default constructor that I dont use
   public Salaried(){}
   
   //Parameterized constructor that makes a Salaried employee
   public Salaried(String n, String social, double annualSal){
      name = n;
      ssn = social;
      annualSalary = annualSal;  
   }
   
   //Setters for the attributes of a salaried employee
   //Takes in a String and returns nothing
   public void setName(String n){name = n;}
   //Takes in a String and returns nothing
   public void setSocial(String social){ssn = social;}
   //Takes in double returns nothing 
   public void setPay(double p){annualSalary = p;}
   
   //Calculates annual pay taking health insurance deductions into account. Takes in nothing returns a double
   public double calcAnnualPay(){return annualSalary - WEEKS * DEDUCTION;}
   
   //Calculates the weekly pay taking health insurance deductions into account. Takes in nothing returns a double
   public double calcWeeklyPay(){return annualSalary/WEEKS - DEDUCTION;}
   
   //Returns a String of a summary of the salaried employee. Takes in nothing returns a String
   public String toString(){
      return String.format("Name: \t%s%nSSN: \t%s%n\tAnnual salary:\t$%10.2f%n\tAnnual Pay:\t\t$%10.2f%n\tWeekly Pay:\t\t$%10.2f", name, ssn, annualSalary, calcAnnualPay(), calcWeeklyPay());
   }
}