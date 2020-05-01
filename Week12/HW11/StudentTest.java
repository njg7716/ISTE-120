/*
Course: ISTE-120
Author: Nicholas Graca
HW11
Purpose: Testing the Student class to learn about inheritence and extending classes
*/

import java.util.Scanner;
import java.util.ArrayList; 


public class StudentTest{

   //Main method to test the student class as well as the undergrad and grad classes that extend the student class
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      ArrayList<Student> enrollment =  new ArrayList<Student>();
      
      //continues loop until user enters a 3 for choice
      while (true){
         System.out.println("What type of student do you wish to enter?\n\t1. Undergrad\n\t2. Graduate\n\t3. Done");
         System.out.print("Choice: ");
         //var choice holds holds choice of user
         int choice = in.nextInt();
         
         //Loop through students printing their info and then exit
         if (choice == 3){
            System.out.println();
            for(int i = 0; i < enrollment.size(); i++){
               System.out.println(enrollment.get(i));
            }
            
            //after looping, exit program
            System.exit(0);
         }
         
         //User picks Grad
         else if (choice == 2){
            in.nextLine();
            System.out.print("Student name: ");
            // var n holds the name
            String n = in.nextLine();
            System.out.print("Student id: ");
            // var i holds the id
            String i = in.nextLine();
            System.out.print("Number of credits: ");
            //var c holds the amount of credits
            int c = in.nextInt();
            in.nextLine();
            System.out.print("Research Area: ");
            //var area hold research area
            String area = in.nextLine();
            
            //create grad obj with info obtained from user
            Grad g = new Grad();
            g.setName(n);
            g.setId(i);
            g.setCredits(c);
            g.setResearch(area);
            
            //add student to arraylist
            enrollment.add(g);
         }
         
         //User picks undergrad
         else if (choice == 1){
            in.nextLine();
            System.out.print("Student name: ");
            //var n holds the name
            String n = in.nextLine();
            System.out.print("Student id: ");
            //var i holds the id
            String i = in.nextLine();
            System.out.print("Number of credits: ");
            //var c holds amount of credits
            int c = in.nextInt();
            System.out.print("Level: ");
            //var level holds undergrads year level
            int level = in.nextInt();
            
            //create undergrad obj with info obtained from user
            Undergrad u = new Undergrad(n, i, c, level);
            
            //add student to arraylist
            enrollment.add(u);
         }
         
         //A little error check in case user cannot read instructions
         else{
            System.out.println("Enter a valid number next time.");
         }
         
         System.out.println();
      }
   }
}