/*
Course: ISTE-120
Author: Nicholas Graca
HW12
Purpose: To follow the instructions
*/

public class Hourly implements Company{
   //Constants
   private static final int STANDARD_HOURS = 40;
   private static final double OVERTIME = 1.5;
   
   //Name of hourly employee
   private String name;
   //Social Security number of employee
   private String ssn;
   //how much money employee makes an hour
   private double hourlyRate;
   //Amount of hours worked a week by employee
   private double avgHoursPerWeek;
   
   //default constructor that I dont use
   public Hourly(){}
   
   //Parameterized constructor that makes hourly employee
   public Hourly(String n, String social, double rate, double avg){
      name = n;
      ssn = social;
      hourlyRate = rate;
      avgHoursPerWeek = avg;
   }
   
   //setters for the attributes of Hourly
   //Takes in String returns nothing
   public void setName(String n){name = n;}
   //Takes in String returns nothing
   public void setSocial(String social){ssn = social;}
   //Takes in Double returns nothing
   public void setPay(double pay){hourlyRate = pay;}
   //Takes in Double returns nothing
   public void setAvgHoursPerWeek(double hours){avgHoursPerWeek = hours;}
   
   //Calculates the annual pay of hourly employee using math
   public double calcAnnualPay(){return hourlyRate * STANDARD_HOURS * WEEKS;}
   
   //Calculates weekly pay and keeps overtime in mind. Takes in nothing and returns a double
   public double calcWeeklyPay(){
      if(avgHoursPerWeek <= STANDARD_HOURS){
         return avgHoursPerWeek * hourlyRate;
      }
      else{
         return (STANDARD_HOURS * hourlyRate) + ((avgHoursPerWeek - STANDARD_HOURS) * hourlyRate * OVERTIME);
      }
   }
   
   //String with the summary of the hourly employee. Takes in nothing and returns a String
   public String toString(){
      return String.format("Name: \t%s%nSSN: \t%s%n\tAverage Hours worked:\t%10.2f%n\tHourly Rate:\t\t\t  $%10.2f%n\tAverage Weekly Pay:\t  $%10.2f%n\tAverage Annual Pay:\t  $%10.2f", name, ssn, avgHoursPerWeek, hourlyRate, calcWeeklyPay(), calcAnnualPay());
   }
}