/**
Course: ISTE-120
Author: Nicholas Graca
HW13
Purpose: Create a phone book and have the ability to add, display and search for records
*/

import java.util.*;
import java.io.*;

public class ContactList
{
   /**
   Contact list file name 
   */
   private String filename;
   
   /**
   ContactList constructor accepts a String parameter
   */
   public ContactList(String inFileName)
   {
      filename = inFileName;
   }
   
   /**
      3) add a new record to the file. Open the file for writing in append mode(there is a FileWriter constructor with the appropriate parameters).
         a) prompt the user to enter data for each field in the record. Each field is a String.
            The last name is required. If the last name is the empty string(""), return to the menu.
         b) when the user has completed entering data(i.e., all the fields have been prompted), re-display the user choices
         c) do not overwrite existing data
   */
   public void new_record()
   {
    /*
      Prompt for data:
         Last name
         First name
         Phone

    */
      //Craete a scanner object
      Scanner s = new Scanner(System.in);
      
      //prompt for the last name
      System.out.print("Last name: ");
      
      //input the last name
      String lastName = s.nextLine();
      
      //the Last_name must not be empty
       if( lastName != "" )
       {
         //get the first name and the phone
         System.out.print("First name: ");
         String firstName = s.nextLine();

         System.out.print("Phone: ");
         String phone = s.nextLine();
          
          //create the output string
          String output = lastName + "," + firstName + "," + phone + "\n";

          //delare variables to hold file types
          File outFile = new File(filename);
          //try to open the file for writing - append the data
          try
          {
            FileWriter writer = new FileWriter(outFile, true);
            
          }
          catch(IOException ioe)
          {
            System.out.println("new_record: Exception opening the file for writing");
          }
          //try to wrtie the data
          try
          {
            FileWriter writer = new FileWriter(outFile, true);
            writer.write(output);
          }
          catch(IOException ioe)
          {
            System.out.println("new_record: Exception writing to the file");
          }
          //try to close the file
          try
          {
            FileWriter writer = new FileWriter(outFile, true);
            writer.write(output);
            writer.close(); 
             
          }
          catch(IOException ioe)
          {
            System.out.println("new_record: Exception closing the file");
          }
          
       }//end of test of Last_name
    
    }//end of new_record
    
    /**
    2) display all last names and first names in the file. 
    Open the file for reading, read each record and 
    display the field values.
      a) display all the lastName, firstName paired fields in the file; 
      display with the format lastName, firstName
      b) when all records have been displayed, display the record count  - the record count is the number of records read and should equal the number of records in the file
      c) after all the records and the count have been displayed, display the user choices
      
    */
    public void display_names()
    {
      //delare variables to hold file types
      File inFile = new File(filename);
      //try to open the file for reading
      try
      {
         FileReader fileReader = new FileReader(inFile);
         BufferedReader br = new BufferedReader(fileReader);
      }
      catch(IOException ioe)
      {
         System.out.println("display_names: Exception opening the file");
      }
      /*
      try to read each record and display the field values.
      a) display all the lastName, firstName paired fields in the file; 
      display with the format lastName, firstName
      count each record that is read 
      */
      int counter = 0; //record counter
      try
      {
         FileReader fileReader = new FileReader(inFile);
         BufferedReader br = new BufferedReader(fileReader);
         //read the first record
         System.out.println();
         String line = br.readLine();
         //while the record is not null, display the record, count the record
         while(line != null){
            System.out.println(line);
            counter++;
            line = br.readLine();
         }
         
         
         
      }
      catch(IOException ioe)
      {
         System.out.println("display_names: Exception reading the file");
      }
      
      //try to close the file
      try
      {
         FileReader fileReader = new FileReader(inFile);
         fileReader.close();
         
      }
      catch(IOException ioe)
      {
         System.out.println("display_names: Exception closing the file");
      }
      //dislay a count of the records read
      System.out.printf("%nTotal records read: %d%n", counter);
    }//end of display_names
    
        /**
          1) search an address file for a particular last name 
          and then display the Last name, the first name, and 
          the phone for each match
          2) display the count of records which match the last name
   
       */
    public void search(String LastName)
    {
      //delare variables to hold file types
      File inFile = new File(filename);
      //try to open the file for reading
      try
      {
         FileReader fr = new FileReader(inFile);
      }
      catch(IOException ioe)
      {
         System.out.println("search: Exception opening the file");
      }
      
      //try to read each record
      //if the value of the Last_name field equals the value
      /*
        create a counter to count the number of
        matching records
      */
      int counter = 0;
      
      try
      {
         //read the first record
         FileReader fr = new FileReader(inFile);
         BufferedReader br = new BufferedReader(fr);
         String line = br.readLine();
         
         //while the record is not null
         while(line != null){
            //split the record into fields
            String[] fields = line.split(",");
            //test if the field equals the LastName parameter
            if(fields[0].equals(LastName)){
               //display the record and increment the counter
               System.out.println(line);
               counter++;
            }
            //read the next record
            line = br.readLine();
         }
         
      }
      catch(IOException ioe)
      {
         System.out.println("search: Exception reading the file");
      }

      // try to close the file
      try
      {
         FileReader fr = new FileReader(inFile);
         fr.close();
         
      }
      catch(IOException ioe)
      {
         System.out.println("search: Exception closing the file");
      }
      
      //dislay a count of the records found
      System.out.printf("Total matching records found: %s%n%n", counter);
      
    }//end of search

}//end of class