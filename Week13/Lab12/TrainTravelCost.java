public class TrainTravelCost implements TravelCost{
   private double duration;
   private double trainFare;
   private String destination;
   
   public TrainTravelCost(double dur, double fare, String dest){
      duration = dur;
      trainFare = fare;
      destination = dest;
   }
   
   public double getLodgingCost(){return 0.0;}
   public double getTotalCost(){return trainFare + AGENT_FEE;}
   
   public double getDuration(){return duration;}
   public String getDestination(){return destination;}
   
   public String toString(){return String.format("Train travel to %s will take %.2f and cost $%.2f.", destination, duration, getTotalCost());}
   
}