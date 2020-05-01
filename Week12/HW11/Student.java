/*
Course: ISTE-120
Author: Nicholas Graca
HW11
Purpose: Testing the Student class to learn about inheritence and extending classes
*/

public class Student{
   private String name;
   private String id;
   private int numCredits;
   
   //default constructor for Student
   public Student(){}
   
   //parameterized constructor for student
   public Student(String n, String i, int c){
      setName(n);
      setId(i);
      setCredits(c);
   }
   
   //Getters for Student variables
   public String getName(){return name;}
   public String getId(){return id;}
   public int getCredits(){return numCredits;}
   
   //Setters for Student variables
   public void setName(String n){name = n;}
   public void setId(String i){id = i;}
   public void setCredits( int c){numCredits = c;}
   
   //This variable is never actually used. It is more of a place holder
   public double calcTuition(){
      return 0.0;
   }
   
   //returns the string to print for the student according to the instructions
   public String toString(){
      return "\tName: \t" + getName() + "\n\tId: \t\t" + getId() + "\n\tCredits: \t\t" + String.valueOf(getCredits());
   }
   
}