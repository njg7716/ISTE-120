/**
 * Clock - program to simulate a clock
 * @author Pete Lutz
 * @version 4.0
 */
public class Clock4 {
   // Attributes of a clock ... info we may wish to see or change
   // "private" means that only Clock4 objects may access these variables
   private int hour;
   private int minute;
   private String ampm;
   
   public static void main(String[] args) {
      // Each 'new' creates an entirely new Clock4 object
      // Each Clock4 object has its OWN copy of the attribute variables
      // These variables can only be used inside "non-static" methods and
      // constructors and do not exist until the program executes a "new"
      Clock4 clockA = new Clock4(8, 25, "AM");
      Clock4 clockB = new Clock4(3, 55, "PM");
      Clock4 clockC = new Clock4(12, 05, "AM");
      
      // The form clockX.print() tells java WHICH Clock4 object to print
      // The clock to print (clockA, clockB or clockC) is somehow passed
      // to the print() method.
      clockA.print();
      clockB.print();
      clockC.print();
   }
  
   /**
    * Constructor for Clock4 objects
    * @param _hour - the hour of the day: 1..12
    * @param _minute - the minute of the hour: 0..59
    * @param _ampm - whether this is an AM or PM time: "AM" or "PM"
    */
   public Clock4(int _hour, int _minute, String _ampm) {
      hour = _hour;
      minute = _minute;
      ampm = _ampm;
   }
   
   /**
    * The print method.
    * Has full access to all attribute variables, so can print each out
    */
   public void print() {
      System.out.println(hour + ":" + minute + " " + ampm);
   }
}