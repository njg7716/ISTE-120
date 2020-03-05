import java.lang.Math;

public class timeInterval{
   private String one;
   private String two;
   
   public timeInterval(String o, String t){
      one = o;
      two = t;
   }
   
   public int getHours(){
      int oHours = Integer.parseInt(one.substring(0,2));
      int tHours = Integer.parseInt(two.substring(0,2));
      int oMins = Integer.parseInt(one.substring(2,4));
      int tMins = Integer.parseInt(two.substring(2,4));
      int oinMins = (oHours*60) + oMins;
      int tinMins = (tHours*60) + tMins;
      int hours = (Math.abs(oinMins - tinMins)) ;
      if(hours >= 60){
         hours = hours/60;
      } else{
         hours = 0;
      }
      return hours;
   }
   public int getMinutes(){
      int oHours = Integer.parseInt(one.substring(0,2));
      int tHours = Integer.parseInt(two.substring(0,2));
      int oMins = Integer.parseInt(one.substring(2,4));
      int tMins = Integer.parseInt(two.substring(2,4));
      int oinMins = (oHours*60) + oMins;
      int tinMins = (tHours*60) + tMins;
      int mins = (Math.abs(oinMins - tinMins));
      mins = mins - (getHours()*60);
      return mins;
   }
   public double getDecimalTime(){
      double d = (double)getHours() + (double)getMinutes()/60;
      return d;
   }
}