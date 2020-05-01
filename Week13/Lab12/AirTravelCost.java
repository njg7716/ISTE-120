
import java.util.GregorianCalendar;

public class AirTravelCost implements TravelCost{
   private String arrivalDate;
   private String departureDate;
   private String arrivalTime;
   private String departureTime;
   private String destination;
   private double travelFare;
   private double hotelCost;
   
   public AirTravelCost(double fare, String departDate, String departTime, String arrDate, String arrTime, String dest, double hotCost){
      arrivalDate = arrDate;
      arrivalTime = arrTime;
      departureDate = departDate;
      departureTime = departTime;
      destination = dest;
      travelFare = fare;
      hotelCost = hotCost;
   }
   
   public String getDestination(){return destination;}
   
   public double getDuration(){
      int departYear = Integer.parseInt(departureDate.substring(0,4));
      int departMonth = Integer.parseInt(departureDate.substring(4,6));
      int departDay = Integer.parseInt(departureDate.substring(6,8));
      int departHour = Integer.parseInt(departureTime.substring(0,2));
      int departMin = Integer.parseInt(departureTime.substring(2,4));
      GregorianCalendar departure = new GregorianCalendar(departYear, departMonth, departDay, departHour, departMin);
      int arriveYear = Integer.parseInt(arrivalDate.substring(0,4));
      int arriveMonth = Integer.parseInt(arrivalDate.substring(4,6));
      int arriveDay = Integer.parseInt(arrivalDate.substring(6,8));
      int arriveHour = Integer.parseInt(arrivalTime.substring(0,2));
      int arriveMin = Integer.parseInt(arrivalTime.substring(2,4));
      GregorianCalendar arrival = new GregorianCalendar(arriveYear, arriveMonth, arriveDay, arriveHour, arriveMin);
      double time = arrival.getTimeInMillis() - departure.getTimeInMillis();
      double hours = time/60000/60;
      return hours;
   }
   
   public double getLodgingCost(){
      if(getDuration() < 24){
         return 0;
      }
      else{
         return (getDuration()/24) * hotelCost;
      }      
   }
   
   public double getTotalCost(){return travelFare + getLodgingCost() + AGENT_FEE;}
   
   public String toString(){
      return String.format("Air travel to %s will take %.2f hours and cost $%.2f", destination, getDuration(), getTotalCost());
   }
}