/*
Course: ISTE-120
Author: Nicholas Graca
HW12
Purpose: To follow the instructions
*/

import java.util.Scanner;
import java.util.ArrayList;

public class Payroll{
   
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      
      //Holds all employees in the company
      ArrayList<Company> employees = new ArrayList<Company>();
      System.out.println();
      
      /*This number keeps track of the amount of employees that have been added
      I know I can take the length of the array but I made this variable before the array
      and I am too lazy to fix code that works. #SorryNotSorry*/
      int num = 0;
      
      //Loops until option 6 is selected
      while(true){
         System.out.printf("What do you want to do?%n\t1  Create a new employee%n\t2  Set pay%n\t3  Show weekly pay%n\t4  Show annual pay%n\t5  Show summary%n\t6 Quit%n==>");
         
         //Keeps track of the option the user picked
         int option = in.nextInt();
         in.nextLine();
         System.out.println();
         
         //If the option is not between 1 and 6. I could have done this better now that I am writting this comment but it works so whatever
         if(option != 1 && option != 2 && option != 3 && option != 4 && option != 5 && option != 6){
            System.out.println("ERROR Bad option, please try again.\n");
            
            //back to the beginning of the loop
            continue;
         }
         
         //Adding a new employee
         if(option == 1){
            
            //loop so that if the user enters something wrong we can come right back
            while(true){
               System.out.print("What type of employee would you like to create (Salaried or Hourly)? ");
               
               //type holds if the new employee is hourly or salaried
               String type = in.nextLine().toUpperCase();
               System.out.println();
               
               //The only options are salaried or hourly so user messed up and this catches it
               if(!type.equals("SALARIED") && !type.equals("HOURLY")){
                  //Tell the user they are wrong
                  System.out.println("***Please enter either salaried or hourly.\n");
                  //back to the beginning of the option 1 loop
                  continue;
               }
               
               //Hourly employees are here
               if(type.equals("HOURLY")){
                  System.out.print("Please enter the name: ");
                  //name keeps the name of the new employee
                  String name = in.nextLine();
                  System.out.println();
                  System.out.print("Please enter the Social Security number: ");
                  //ssn keeps the social security number of the new employee
                  String ssn = in.nextLine();
                  System.out.println();
                  //hourly rate of employee. Java is dumb and does not realize that the loop will always run so I define it here
                  double rate;
                  while(true){
                     System.out.print("Please enter hourly rate of pay: ");
                     rate = in.nextDouble();
                     System.out.println();
                     //error check for hourly rate
                     if(rate <= 0){
                        System.out.println("***Please enter a number > 0.\n");
                        //back the the most recent loop
                        continue;        
                     }
                     //get out of most recent loop
                     break;
                  }
                  //average hours worked by hourly employee. Again java is dumb so I have to do it here
                  double avg;
                  while(true){   
                     System.out.print("Please enter the average number of hours worked per week: ");
                     avg = in.nextDouble();
                     in.nextLine();
                     System.out.println();
                     //error checking for average hours worked
                     if(avg < 15){
                        System.out.println("***Please enter a number > 15\n");
                        //back to beginning of most recent loop
                        continue;
                     }
                     //more error checking
                     if(avg > 60){
                        System.out.println("***Please enter a number < 60\n");
                        //back to beginning of most recent loop
                        continue;
                     }
                     //get out of loop because the input is right
                     break;
                  }
                  //create hourly employee
                  Hourly emp = new Hourly(name, ssn, rate, avg);
                  //keeping track of the number of employees created
                  num++;
                  //add employee to the array
                  employees.add(emp);
                  //notify user that employee has been created
                  System.out.printf("==> Employee %d has been created.%n%n", num);
                  //get out of option 1 loop
                  break;
               }
               //if they arent hourly then they much be salaried
               else if(type.equals("SALARIED")){
                  System.out.print("Please enter the name: ");
                  String name = in.nextLine();
                  System.out.println();
                  System.out.print("Please enter the Social Security number: ");
                  String ssn = in.nextLine();
                  System.out.println();
                  System.out.print("Please enter the annual pay: ");
                  //annual pay of the employee
                  int pay = in.nextInt();
                  in.nextLine();
                  //create new salaried employee
                  Salaried emp = new Salaried(name, ssn, pay);
                  //add the employee to the array
                  employees.add(emp);
                  //keeping track of the number of employees created
                  num++;
                  System.out.printf("%n==> Employee %d has been created.%n%n", num);
                  //get out of option 1 loop
                  break;
               }
               
            }
            continue;
         }
         //Set the pay of the employee
         if(option == 2){
            System.out.printf("Which employee do you wish to use (enter 1 to %d)? ", num);
            //the employee that they want to set the pay for
            int empNum = in.nextInt();
            in.nextLine();
            System.out.println();
            //loop in case they enter bad info
            while(true){
               //the number needs to be greater than 0 and less than the number of employees in the array
               if(empNum < 1 || empNum > num){
                  System.out.printf("***ERROR Please enter an employee number from 1 to %d: ", num);
                  empNum = in.nextInt();
                  in.nextLine();
                  //back to the most recent loop
                  continue;
               }
               //get out of most recent loop
               break;
            }
            //again looping for input
            while(true){
               System.out.print("\nHow much would you like to set the annual pay to? ");
               //the new annual pay that will be set
               int annualPay = in.nextInt();
               in.nextLine();
               System.out.println();
               //error checking
               if(annualPay <= 0){
                  System.out.println("***ERROR Please enter an amount > 0.");
                  System.out.println();
                  continue;
               }
               //set the new annual pay amount. have to -1 to the empNum because arrays are 0 indexed
               employees.get(empNum - 1).setPay(annualPay);
               break;
            }
            continue;
         }
         //show weekly pay
         else if(option == 3){
            //the logic is copy pasted from above
            System.out.printf("Which employee do you wish to use (enter 1 to %d)? ", num);
            int empNum = in.nextInt();
            in.nextLine();
            System.out.println();
            while(true){
               if(empNum < 1 || empNum > num){
                  System.out.printf("***ERROR Please enter an employee number from 1 to %d: ", num);
                  empNum = in.nextInt();
                  in.nextLine();
                  continue;
               }
               //print weekly pay again -1 to empNum
               System.out.printf("%nThe weekly pay is $%.2f%n%n", employees.get(empNum - 1).calcWeeklyPay());
               break;
            }
            continue;
         }
         //show annual pay
         else if(option == 4){
            //same logic different option
            System.out.printf("Which employee do you wish to use (enter 1 to %d)? ", num);
            int empNum = in.nextInt();
            in.nextLine();
            System.out.println();
            while(true){
               if(empNum < 1 || empNum > num){
                  System.out.printf("***ERROR Please enter an employee number from 1 to %d: ", num);
                  empNum = in.nextInt();
                  in.nextLine();
                  continue;
               }
               //print the annual pay of selected employee. -1 to empNum, are you starting to see a pattern?
               System.out.printf("%nThe annual pay is $%.2f%n%n", employees.get(empNum - 1).calcAnnualPay());
               break;
            }
            continue;
         }
         //show summary of selected employee
         else if(option == 5){
            //Hmmm this looks familiar
            System.out.printf("Which employee do you wish to use (enter 1 to %d)? ", num);
            int empNum = in.nextInt();
            in.nextLine();
            System.out.println();
            while(true){
               if(empNum < 1 || empNum > num){
                  System.out.printf("***ERROR Please enter an employee number from 1 to %d: ", num);
                  empNum = in.nextInt();
                  in.nextLine();
                  continue;
               }
               //use the toString method of the employee to print summary
               System.out.println(employees.get(empNum - 1).toString());
               System.out.println();
               break;
            }
            continue;
         }
         //Exit program
         else if(option == 6){
            System.exit(0);
         }
      }
   }
   
}