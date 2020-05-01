/**
Homework 14 Contact List
*/
import java.util.*;
public class TestContactList {
   public static void main(String [] args)  {
      final int ONE   = 1;
      final int TWO   = 2;
      final int THREE = 3;
      final int FOUR  = 4;
      final int FIVE  = 5;
      
      Scanner scan = new Scanner(System.in);
      while(true)   {
         System.out.println("1) Search the file for a last name ");
         System.out.println("2) Display all last & first names in file");
         System.out.println("3) Add a new record to the file ");
         System.out.println("4) End the program ");
         System.out.print("Please choose 1 - 4: ");
         int choice = scan.nextInt();
         scan.nextLine();
         
         /*
         Create a new ContactList object with the name of the
         contact list file.
         */
         ContactList cl = new ContactList("MyAddressBook.txt");
           
         if(choice == ONE)  {
            System.out.print("Enter name to find: ");
            String findMe = scan.nextLine();
            cl.search(findMe);
         }
         
         if(choice == TWO)  {    // then call display names
            cl.display_names();
         }

         if(choice == THREE)   { // then call new record 
            cl.new_record();
         }
         
         if(choice == FOUR)  { System.exit(0); }
      }
   }
}