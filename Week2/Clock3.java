/**
 * Clock - program to simulate a clock
 * @author Pete Lutz
 * @version 3.0
 */
public class Clock3 {
   // Attributes of a clock ... info we may wish to see or change
   private int hour;
   private int minute;
   private String ampm;
   
   public static void main(String[] args) {
      Clock3 myClock = new Clock3(8, 25, "AM");
      myClock.print();
   }
   
   public Clock3(int _hour, int _minute, String _ampm) {
      hour = _hour;
      minute = _minute;
      ampm = _ampm;
   }
   
   public void print() {
      System.out.println(hour + ":" + minute + " " + ampm);
   }
}