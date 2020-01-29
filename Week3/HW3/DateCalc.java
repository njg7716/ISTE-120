/*
Name: Nicholas graca
Course: ISTE-120
HW: #3
*/
import java.util.*;

public class DateCalc{

   public static void main (String[] args){
      //Get today
      GregorianCalendar today = new GregorianCalendar();
      int dayOfMonth = today.get(Calendar.DAY_OF_MONTH);
      int month = today.get(Calendar.MONTH);
      int year = today.get(Calendar.YEAR);
      int weekday = today.get(Calendar.DAY_OF_WEEK);
      System.out.println("Today's date is "+ month + "/" + dayOfMonth + "/" + year + " which is day " + weekday + " of the week");
      //Add 100 days to today
      today.add(Calendar.DAY_OF_MONTH, 100);
      System.out.println("In 100 days, it will be "+ today.get(Calendar.MONTH) + "/" + today.get(Calendar.DAY_OF_MONTH) + "/" +
      today.get(Calendar.YEAR) + " which is day " + today.get(Calendar.DAY_OF_WEEK) + " of the week");
      
      //Get my birthday
      GregorianCalendar birthday = new GregorianCalendar(1998, Calendar.MAY, 27);
      System.out.println("My Birthday is "+ birthday.get(Calendar.MONTH) + "/" + birthday.get(Calendar.DAY_OF_MONTH) + "/" +
      birthday.get(Calendar.YEAR) + " which is day " + birthday.get(Calendar.DAY_OF_WEEK) + " of the week");
      //Get 10,000 days after my birthday
      birthday.add(Calendar.DAY_OF_MONTH, 10000);
      System.out.println("The date 10,000 days after my birthday is "+ birthday.get(Calendar.MONTH) + "/" + birthday.get(Calendar.DAY_OF_MONTH) + "/" +
      birthday.get(Calendar.YEAR) + " which is day " + birthday.get(Calendar.DAY_OF_WEEK) + " of the week");
   }
   
}