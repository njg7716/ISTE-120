/**
 * Clock - program to simulate a clock
 * @author Pete Lutz
 * @version 1.0
 */
public class Clock {
   private int hour;
   private int min;
   private String ampm;

   public Clock1(){
      hour = 12;
      min = 00;
      ampm = "AM";
   }
   
   public void clear(){
      hour = 12;
      min = 00;
      ampm = "AM";
   }
   public void printTime(){
   System.out.println(hour + ":" + min + " " + ampm);
   }
   public static void main(String[] args) {
      Clock c = new Clock();
      c.printTime();
   }
}