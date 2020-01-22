/**
 * Clock - program to simulate a clock
 * @author Pete Lutz
 * @version 1.0
 */
public class Clock {
   private int _hour;
   private int _min;
   private String _ampm;

   public Clock(){
      clear();
   }
   
   public void clear(){
      _hour = 12;
      _min = 00;
      _ampm = "am";
   }
   
   public void printTime(){
   String m = String.valueOf(_min);
   if(_min < 10){
      m = "0" + m;
   }
   System.out.println(_hour + ":" + m + " " + _ampm);
   }
   
   public String getTime(){
      String time = _hour + ":" + _min + " " + _ampm;
      return time;
   }
   
   public void setTime(int h, int m, String a){
      a = a.toLowerCase();
      if(h>12){
         System.out.println("Invalid Hour Set.");
      }
      if(m>59){
         System.out.println("Invalid Minute Set.");
      }
      if(a.equals("am") && a.equals("pm")){
         System.out.println("Please enter am or pm.");
      }
      _hour = h;
      _min = m;
      _ampm = a.toLowerCase();
   }
   
   public static void main(String[] args) {
      Clock c1 = new Clock();
      Clock c2 = new Clock();
      Clock c3 = new Clock();
      c1.setTime(9,15, "PM");
      c2.setTime(10,15, "PM");
      c3.setTime(12,15, "PM");
      c1.printTime();
      c2.printTime();
      c3.printTime();
   }
}