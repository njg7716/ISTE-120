
import java.util.Scanner;

public class testTimeInterval{
   
   public static void main(String[] args){
      Scanner reader = new Scanner(System.in);
      System.out.print("Please enter the first time: ");
      String o = reader.nextLine();
      System.out.print("Please enter the second time: ");
      String t = reader.nextLine();
      if (Integer.parseInt(o) < 0 || Integer.parseInt(t) < 0){
         System.out.println("One of the times enter is invalid.");
         System.exit(0);
      }
      if (Integer.parseInt(o) > 2400 || Integer.parseInt(t) > 2400){
         System.out.println("One of the times enter is invalid.");
         System.exit(0);
      }
      timeInterval time = new timeInterval(o,t);
      System.out.println();
      System.out.println("Elapsed time in hrs/min: " + String.valueOf(time.getHours()) + " hours " + String.valueOf(time.getMinutes()) + " minutes");
      System.out.println("Elapsed time in decimal: " + time.getDecimalTime() + " hours");
      
   }

}