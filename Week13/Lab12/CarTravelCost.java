public class CarTravelCost implements TravelCost{
   private int numMiles;
   private double hotelCost;
   private String destination;
   
   public CarTravelCost(int miles, double cost, String dest){
      numMiles = miles;
      hotelCost = cost;
      destination = dest;
   }
   
   public String getDestination(){return destination;}
   
   public double getDuration(){return (double)numMiles/65;}
   public double getLodgingCost(){return (Math.floor(getDuration()/8.0))*hotelCost;}
   public double getTotalCost(){return numMiles * .45 + getLodgingCost() + AGENT_FEE;}
   public String toString(){return String.format("Car travel to %s will take %.2f hours and $%.2f.", destination, getDuration(), getTotalCost());}
}